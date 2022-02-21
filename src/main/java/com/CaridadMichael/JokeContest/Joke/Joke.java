package com.CaridadMichael.JokeContest.Joke;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table
public class Joke {
	@Id	
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="joke_id")
	private long id;	
	private String joke;
	private int rating = 0;

	
	public Joke() {}

	public Joke(long id,  String joke,int rating) {
		this.id = id;	
		this.joke = joke;	
		this.rating = rating;
	}
	
	public Joke( String author, String joke,  int rating) {	
		this.joke = joke;
	
		this.rating = rating;
	}

	
	public long getId() {
		return id;
	}

	
	public void setId(long id) {
		this.id = id;
	}	

	
	public String getJoke() {
		return joke;
	}

	
	public void setJoke(String joke) {
		this.joke = joke;
	}

	


	
	public int getRating() {
		return rating;
	}

	
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Joke [id=" + id + " joke=" + joke + ", rating=" + rating
				+ "]";
	}
	
	

}

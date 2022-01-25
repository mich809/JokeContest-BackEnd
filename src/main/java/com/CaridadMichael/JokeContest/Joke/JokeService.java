package com.CaridadMichael.JokeContest.Joke;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
	
	private final JokeRepository jokeRepo;

	@Autowired
	public JokeService(JokeRepository jokeRepo) {		
		this.jokeRepo = jokeRepo;
	}
	

	public Joke createJoke(Joke joke) {		 
	     return jokeRepo.save(joke);
	}
	
	public Joke upVote(Joke joke) {
		Joke updateJoke = jokeRepo.findById(joke.getId()).get();
		updateJoke.setJoke(updateJoke.getJoke());
		updateJoke.setRating(updateJoke.getRating() + 1);
		return jokeRepo.save(updateJoke);
	}
	
	public Joke downVote(Joke joke) {
		Joke updateJoke = jokeRepo.findById(joke.getId()).get();
		updateJoke.setJoke(updateJoke.getJoke());
		updateJoke.setRating(updateJoke.getRating() - 1);
		return jokeRepo.save(updateJoke);
	}
	
	public List<Joke> getTopTenJokes(){
		return jokeRepo.getTopTenJokes();
	}

}

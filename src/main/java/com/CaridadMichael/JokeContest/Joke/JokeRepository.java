package com.CaridadMichael.JokeContest.Joke;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JokeRepository extends CrudRepository<Joke,Long> {

	@Query(value="select * from joke.joke order by rating desc limit 5", nativeQuery=true)
	List<Joke> getTopTenJokes();
}

package com.CaridadMichael.JokeContest.Joke;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JokeRepository extends CrudRepository<Joke,Long> {

}

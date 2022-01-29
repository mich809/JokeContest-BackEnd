package com.CaridadMichael.JokeContest.Joke;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "Api/Joke")
public class JokeController {
	
	 @Autowired
	 JokeService jokeService;
	
	
	 @PostMapping(value = "/submitJoke")
	 public Joke submitJoke(@RequestBody Joke joke) {    	
			 return jokeService.createJoke(joke);
			
	}
	 
	@PutMapping(value = "/upVote")
	public Joke upvoteJoke(@RequestBody Joke joke) {
		return jokeService.upVote(joke);
		
	}
	
	@PutMapping(value = "/downVote")
	public Joke downVote(@RequestBody Joke joke) {
		return jokeService.downVote(joke);
		
	}
	
	@GetMapping(value = "/topTen")
	public List<Joke> getTopTen(){
		return jokeService.getTopTenJokes();
	}
	
	@GetMapping(value = "/randomJoke")
	public Joke getRandomJoke() {
		return jokeService.getRandomJoke();
	}
	 
	 
	 
	

}

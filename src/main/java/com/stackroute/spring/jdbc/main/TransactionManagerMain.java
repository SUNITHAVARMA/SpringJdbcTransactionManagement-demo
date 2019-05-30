package com.stackroute.spring.jdbc.main;

import com.stackroute.spring.jdbc.model.Actor;
import com.stackroute.spring.jdbc.model.Movie;
import com.stackroute.spring.jdbc.service.MovieManagerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.spring.jdbc.service.MovieManager;

public class TransactionManagerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");

		MovieManager movieManager = ctx.getBean("movieManager",
				MovieManagerImpl.class);

		Movie movie = createDummyMovie();
		movieManager.movieManager(movie);

		ctx.close();
	}

	private static Movie createDummyMovie() {
		Movie movie = new Movie();
		movie.setMovieId(101);
		movie.setMovieName("majili");
		movie.setReleasedYear(2018);
		movie.setRatings(5);
		Actor actor = new Actor();
		actor.setActorAge(25);
		actor.setActorName("prabhas");
		actor.setMovieId(movie.getMovieId());
		movie.setActor(actor);
		return movie;
	}

}

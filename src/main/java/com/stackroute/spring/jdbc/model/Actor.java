package com.stackroute.spring.jdbc.model;

public class Actor {

	private int movieId;
	private int actorAge;
	private String actorName;

	public int getActorAge() {
		return actorAge;
	}

	public void setActorAge(int actorAge) {
		this.actorAge = actorAge;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
}

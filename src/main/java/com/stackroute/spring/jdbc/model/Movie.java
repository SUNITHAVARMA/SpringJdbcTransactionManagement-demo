package com.stackroute.spring.jdbc.model;

public class Movie {

	private int movieId;
	private String movieName;
	private int releasedYear;
	private float ratings;
	private Actor actor;

	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Movie(){

	}

	public Movie(int movieId, String movieName, int releasedYear, float ratings, Actor actor) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.releasedYear = releasedYear;
		this.ratings = ratings;
		this.actor = actor;
	}


	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"movieId=" + movieId +
				", movieName='" + movieName + '\'' +
				", releasedYear=" + releasedYear +
				", ratings=" + ratings +
				", actor=" + actor +
				'}';
	}

}

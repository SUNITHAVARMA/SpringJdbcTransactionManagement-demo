package com.stackroute.spring.jdbc.dao;

import javax.sql.DataSource;

import com.stackroute.spring.jdbc.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDAOImpl implements MovieDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void create(Movie movie) {
		String queryCustomer = "insert into movie (movieId, movieName,releasedYear,ratings) values (?,?,?,?)";
		String queryAddress = "insert into actor(movieId,actorName,actorAge) values (?,?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(queryCustomer, new Object[] { movie.getMovieId(),
				movie.getMovieName(),
				movie.getReleasedYear(),
				movie.getRatings()});
		System.out.println("Inserted into Movie Table Successfully");
		jdbcTemplate.update(queryAddress, new Object[] { movie.getMovieId(),
				movie.getActor().getActorName(),
				movie.getActor().getActorAge()

				 });
		System.out.println("Inserted into Actor Table Successfully");
	}

}

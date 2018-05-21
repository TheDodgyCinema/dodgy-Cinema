package com.qa.dodgy.business.repository;

import java.util.List;

import com.qa.dodgy.persistence.domain.Movie;

public interface IMovieRepository {
	public List<Movie> getMovies();
	
	public Movie getMovie(Long id);

}

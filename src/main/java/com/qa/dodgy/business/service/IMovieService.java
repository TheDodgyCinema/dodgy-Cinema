package com.qa.dodgy.business.service;

import java.util.List;

import com.qa.dodgy.business.repository.IMovieRepository;
import com.qa.dodgy.persistence.domain.Movie;

public interface IMovieService {
	
	public List<Movie> getMovies();
	
	public Movie getMovie(Long id);
	
	void setRepo(IMovieRepository repo);

}

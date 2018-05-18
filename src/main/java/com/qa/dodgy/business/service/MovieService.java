package com.qa.dodgy.business.service;

import java.util.List;

import javax.inject.Inject;

import com.qa.dodgy.business.repository.IMovieRepository;
import com.qa.dodgy.persistence.domain.Movie;

public class MovieService implements IMovieService {
	@Inject
	private IMovieRepository repo;

	public List<Movie> getMovies() {
		return repo.getMovies();
	}
}

package com.qa.dodgy.business.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.qa.dodgy.persistence.domain.Movie;

import com.qa.dodgy.util.JSONUtil;

public class MovieRepositoryDB implements IMovieRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	public List<Movie> getMovies(){
		TypedQuery<Movie> query = manager.createQuery("SELECT m FROM Movie m", Movie.class);
		return query.getResultList();
	}
	
	private Movie findMovie(Long id) {
		return manager.find(Movie.class, id);
	}
	
	public Movie getMovie(Long id) {
		Movie aMovie = findMovie(id);
		return aMovie;
	}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
}

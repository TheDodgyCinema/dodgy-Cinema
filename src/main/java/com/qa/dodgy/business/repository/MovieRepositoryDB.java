package com.qa.dodgy.business.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.qa.dodgy.persistence.domain.Movie;

public class MovieRepositoryDB implements IMovieRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	public List<Movie> getMovies(){
		TypedQuery<Movie> query = manager.createQuery("SELECT m FROM Movie m", Movie.class);
		return query.getResultList();
	}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
}

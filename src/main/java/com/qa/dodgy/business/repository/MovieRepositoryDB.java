package com.qa.dodgy.business.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.qa.dodgy.persistence.domain.Movie;

public class MovieRepositoryDB implements IMovieRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	public List<Movie> getMovies(){
		TypedQuery<Movie> query = manager.createQuery("SELECT m FROM Movie m", Movie.class);
		return query.getResultList();
	}
	
	private Movie findMovie(Long id) {
		return manager.find(Movie.class, id);
	}
	
	public Movie getMovie(Long id) {
		Movie movie = findMovie(id);
		return movie;
	}
	
	@Transactional
	public Movie deleteMovie(Long id) {
		Movie movieInDB = findMovie(id);
		manager.remove(movieInDB);
		return movieInDB;
	}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	
	
}

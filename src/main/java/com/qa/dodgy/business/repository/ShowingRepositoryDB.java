package com.qa.dodgy.business.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.qa.dodgy.persistence.domain.Movie;
import com.qa.dodgy.persistence.domain.Showing;

public class ShowingRepositoryDB implements IShowingRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	private Showing findShowing(Long id) {
		return manager.find(Showing.class, id);
	}
	
	public Showing getShowing(Long id) {
		Showing showing = findShowing(id);
		return showing;
	}
	
	public List<Showing> getShowings(){
		TypedQuery<Showing> query = manager.createQuery("SELECT m FROM Showing m", Showing.class);
		return query.getResultList();
	}
	
	@Transactional
	public Showing deleteShowing(Long id) {
		Showing showingInDB = findShowing(id);
		manager.remove(showingInDB);
		return showingInDB;
	}
}

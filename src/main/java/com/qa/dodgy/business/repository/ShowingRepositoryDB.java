package com.qa.dodgy.business.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.dodgy.persistence.domain.Showing;

public class ShowingRepositoryDB implements IShowingRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	private Showing findShowing(Long id) {
		return manager.find(Showing.class, id);
	}
	
	public Showing getShowing(Long id) {
		Showing aShowing = findShowing(id);
		return aShowing;
	}
	
	@Transactional
	public Showing deleteShowing(Long id) {
		Showing showingInDB = findShowing(id);
		manager.remove(showingInDB);
		return showingInDB;
	}
}

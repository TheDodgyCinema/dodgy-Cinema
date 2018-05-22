package com.qa.dodgy.business.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.qa.dodgy.persistence.domain.Screen;

public class ScreenRepositoryDB implements IScreenRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	public List<Screen> getScreens(){
		TypedQuery<Screen> query = manager.createQuery("SELECT m FROM Screen m", Screen.class);
		return query.getResultList();
	}
	
	private Screen findScreen(Long id) {
		return manager.find(Screen.class, id);
	}
	
	public Screen getScreen(Long id) {
		Screen screen = findScreen(id);
		return screen;
	}
	
	@Transactional
	public Screen deleteScreen(Long id) {
		Screen screenInDB = findScreen(id);
		manager.remove(screenInDB);
		return screenInDB;
	}

}

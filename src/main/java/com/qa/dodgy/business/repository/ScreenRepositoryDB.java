package com.qa.dodgy.business.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.dodgy.persistence.domain.Screen;

public class ScreenRepositoryDB implements IScreenRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	private Screen findScreen(Long id) {
		return manager.find(Screen.class, id);
	}
	
	public Screen getScreen(Long id) {
		Screen aScreen = findScreen(id);
		return aScreen;
	}
	
	@Transactional
	public Screen deleteScreen(Long id) {
		Screen screenInDB = findScreen(id);
		manager.remove(screenInDB);
		return screenInDB;
	}

}

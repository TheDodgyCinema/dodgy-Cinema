package com.qa.dodgy.business.service;

import javax.inject.Inject;

import com.qa.dodgy.business.repository.IScreenRepository;
import com.qa.dodgy.persistence.domain.Screen;

public class ScreenService implements IScreenService {
	
	@Inject
	private IScreenRepository repo;

	@Override
	public void setRepo(IScreenRepository repo) {
		this.repo = repo;
	}

	public Screen getScreen(Long id) {
		return repo.getScreen(id);
	}
	
	public Screen deleteScreen(Long id) {
		return repo.deleteScreen(id);
	}

}

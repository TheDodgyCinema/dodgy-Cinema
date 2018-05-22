package com.qa.dodgy.business.service;

import javax.inject.Inject;

import com.qa.dodgy.business.repository.IShowingRepository;
import com.qa.dodgy.persistence.domain.Showing;

public class ShowingService implements IShowingService{
	
	@Inject
	private IShowingRepository repo;
	
	public Showing getShowing(Long id) {
		return repo.getShowing(id);
	}

	@Override
	public void setRepo(IShowingRepository repo) {
		this.repo = repo;	
	}

}

package com.qa.dodgy.business.service;

import com.qa.dodgy.business.repository.IScreenRepository;
import com.qa.dodgy.persistence.domain.Screen;

public interface IScreenService {
	
	public Screen getScreen(Long id);
	
	void setRepo(IScreenRepository repo);
	
	public Screen deleteScreen(Long id);

}

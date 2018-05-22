package com.qa.dodgy.business.service;

import java.util.List;

import com.qa.dodgy.business.repository.IScreenRepository;
import com.qa.dodgy.persistence.domain.Screen;

public interface IScreenService {
	
	public List<Screen> getScreens();
	
	public Screen getScreen(Long id);
	
	void setRepo(IScreenRepository repo);
	
	public Screen deleteScreen(Long id);

}

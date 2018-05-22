package com.qa.dodgy.business.repository;

import java.util.List;

import com.qa.dodgy.persistence.domain.Screen;

public interface IScreenRepository {
	
	public List<Screen> getScreens();
	
	public Screen getScreen(Long id);
	
	public Screen deleteScreen(Long id);

}

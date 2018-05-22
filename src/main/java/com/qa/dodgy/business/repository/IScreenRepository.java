package com.qa.dodgy.business.repository;

import com.qa.dodgy.persistence.domain.Screen;

public interface IScreenRepository {
	
	public Screen getScreen(Long id);
	
	public Screen deleteScreen(Long id);

}

package com.qa.dodgy.business.service;


import com.qa.dodgy.business.repository.IShowingRepository;
import com.qa.dodgy.persistence.domain.Showing;


public interface IShowingService {
	
	public Showing getShowing(Long id);
	
	void setRepo(IShowingRepository repo);
	
	public Showing deleteShowing(Long id);

}

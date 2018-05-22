package com.qa.dodgy.business.repository;

import java.util.List;

import com.qa.dodgy.persistence.domain.Showing;

public interface IShowingRepository {
	
	public List<Showing> getShowings();
	
	public Showing getShowing(Long id);
	
	public Showing deleteShowing(Long id);

}

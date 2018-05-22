package com.qa.dodgy.business.repository;

import com.qa.dodgy.persistence.domain.Showing;

public interface IShowingRepository {
	
	public Showing getShowing(Long id);
	
	public Showing deleteShowing(Long id);

}

package com.qa.dodgy.business.service;

import com.qa.dodgy.business.repository.ISeatRepository;
import com.qa.dodgy.persistence.domain.Seat;

public interface ISeatService {

public Seat getSeat(Long id);
	
	void setRepo(ISeatRepository repo);
	
	public Seat deleteSeat(Long id);
}

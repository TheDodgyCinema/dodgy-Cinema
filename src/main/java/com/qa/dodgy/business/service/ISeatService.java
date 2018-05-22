package com.qa.dodgy.business.service;

import java.util.List;

import com.qa.dodgy.business.repository.ISeatRepository;
import com.qa.dodgy.persistence.domain.Seat;

public interface ISeatService {

	public Seat getSeat(Long id);
	
	public List<Seat> getSeats();

	void setRepo(ISeatRepository repo);
	
	public Seat deleteSeat(Long id);
}

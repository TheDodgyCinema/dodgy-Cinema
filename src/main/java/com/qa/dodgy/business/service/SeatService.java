package com.qa.dodgy.business.service;

import javax.inject.Inject;

import com.qa.dodgy.business.repository.ISeatRepository;
import com.qa.dodgy.persistence.domain.Seat;


public class SeatService implements ISeatService {

	@Inject
	private ISeatRepository repo;
	
	public Seat getSeat(Long id) {
		return repo.getSeat(id);
	}

	@Override
	public void setRepo(ISeatRepository repo) {
		this.repo = repo;	
	}
}

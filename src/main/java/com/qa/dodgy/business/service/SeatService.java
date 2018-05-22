package com.qa.dodgy.business.service;

import java.util.List;

import javax.inject.Inject;

import com.qa.dodgy.business.repository.ISeatRepository;
import com.qa.dodgy.persistence.domain.Movie;
import com.qa.dodgy.persistence.domain.Seat;


public class SeatService implements ISeatService {

	@Inject
	private ISeatRepository repo;
	
	public Seat getSeat(Long id) {
		return repo.getSeat(id);
	}

	public List<Seat> getSeats() {
		return repo.getSeats();
	}
	
	@Override
	public void setRepo(ISeatRepository repo) {
		this.repo = repo;	
	}
	
	public Seat deleteSeat(Long id) {
		return repo.deleteSeat(id);
	}
}

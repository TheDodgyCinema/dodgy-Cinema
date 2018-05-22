package com.qa.dodgy.business.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qa.dodgy.persistence.domain.Seat;

public class SeatRepositoryDB implements ISeatRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	private Seat findSeat(Long id) {
		return manager.find(Seat.class, id);
	}
	
	public Seat getSeat(Long id) {
		Seat aSeat = findSeat(id);
		return aSeat;
	}
}

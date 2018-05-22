package com.qa.dodgy.business.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.dodgy.persistence.domain.Seat;

public class SeatRepositoryDB implements ISeatRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	private Seat findSeat(Long id) {
		return manager.find(Seat.class, id);
	}
	
	public Seat getSeat(Long id) {
		Seat seat = findSeat(id);
		return seat;
	}
	
	@Transactional
	public Seat deleteSeat(Long id) {
		Seat seatInDB = findSeat(id);
		manager.remove(seatInDB);
		return seatInDB;
	}
}

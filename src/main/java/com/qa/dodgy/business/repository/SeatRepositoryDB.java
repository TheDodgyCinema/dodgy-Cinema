package com.qa.dodgy.business.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.qa.dodgy.persistence.domain.Seat;

public class SeatRepositoryDB implements ISeatRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	public List<Seat> getSeats(){
		TypedQuery<Seat> query = manager.createQuery("SELECT m FROM Seat m", Seat.class);
		return query.getResultList();
	}
	
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

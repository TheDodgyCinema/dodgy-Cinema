package com.qa.dodgy.business.repository;

import java.util.List;


import com.qa.dodgy.persistence.domain.Seat;

public interface ISeatRepository {
	
	public List<Seat> getSeats();
	
	public Seat getSeat(Long id);

	public Seat deleteSeat(Long id);
}

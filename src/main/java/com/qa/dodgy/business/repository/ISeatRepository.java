package com.qa.dodgy.business.repository;

import com.qa.dodgy.persistence.domain.Seat;

public interface ISeatRepository {
	
	public Seat getSeat(Long id);

	public Seat deleteSeat(Long id);
}

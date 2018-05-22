package com.qa.dodgy.business.repository;

import com.qa.dodgy.persistence.domain.Ticket;

public interface ITicketRepository {
	
	public Ticket getTicket(Long id);
	
	public Ticket deleteTicket(Long id);

}

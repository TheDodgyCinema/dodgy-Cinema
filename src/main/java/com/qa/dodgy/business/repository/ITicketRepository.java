package com.qa.dodgy.business.repository;

import java.util.List;

import com.qa.dodgy.persistence.domain.Ticket;

public interface ITicketRepository {
	
	public List<Ticket> getTickets();
	
	public Ticket getTicket(Long id);
	
	public Ticket deleteTicket(Long id);

	public Ticket addTicket(Ticket ticket);

}

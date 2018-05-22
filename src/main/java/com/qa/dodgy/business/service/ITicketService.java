package com.qa.dodgy.business.service;

import java.util.List;

import com.qa.dodgy.business.repository.ITicketRepository;
import com.qa.dodgy.persistence.domain.Ticket;

public interface ITicketService {
	
	public List<Ticket> getTickets();
	
	public Ticket getTicket(Long id);
	
	void setRepo(ITicketRepository repo);
	
	public Ticket deleteTicket(Long id);

	public Ticket addTicket(Ticket ticket);

}

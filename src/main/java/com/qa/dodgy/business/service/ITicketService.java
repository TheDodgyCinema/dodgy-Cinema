package com.qa.dodgy.business.service;

import com.qa.dodgy.business.repository.ITicketRepository;
import com.qa.dodgy.persistence.domain.Ticket;

public interface ITicketService {
	
	public Ticket getTicket(Long id);
	
	void setRepo(ITicketRepository repo);
	
	public Ticket deleteTicket(Long id);

	public Ticket addTicket(Ticket aTicket);

}

package com.qa.dodgy.business.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.qa.dodgy.persistence.domain.Ticket;

public class TicketRepositoryDB implements ITicketRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	private Ticket findTicket(Long id) {
		return manager.find(Ticket.class, id);
	}
	
	public Ticket getTicket(Long id) {
		Ticket aTicket = findTicket(id);
		return aTicket;
	}
}

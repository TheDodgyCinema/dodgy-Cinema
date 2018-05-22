package com.qa.dodgy.business.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.qa.dodgy.persistence.domain.Ticket;

public class TicketRepositoryDB implements ITicketRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	private Ticket findTicket(Long id) {
		return manager.find(Ticket.class, id);
	}
	
	public Ticket getTicket(Long id) {
		Ticket ticket = findTicket(id);
		return ticket;
	}
	
	@Transactional
	public Ticket deleteTicket(Long id) {
		Ticket ticketInDB = findTicket(id);
		manager.remove(ticketInDB);
		return ticketInDB;
	}

	public Ticket addTicket(Ticket ticket) {
		manager.persist(ticket);
		return getTicket(ticket.getId());
	}
	
	public List<Ticket> getTickets(){
		TypedQuery<Ticket> query = manager.createQuery("SELECT m FROM Ticket m", Ticket.class);
		return query.getResultList();
	}
}

package com.qa.dodgy.business.service;

import java.util.List;

import javax.inject.Inject;

import com.qa.dodgy.business.repository.ITicketRepository;
import com.qa.dodgy.persistence.domain.Movie;
import com.qa.dodgy.persistence.domain.Ticket;

public class TicketService implements ITicketService {
	
	@Inject
	private ITicketRepository repo;
	
	public Ticket getTicket(Long id) {
		return repo.getTicket(id);
	}

	@Override
	public void setRepo(ITicketRepository repo) {
		this.repo = repo;	
	}
	
	public Ticket deleteTicket(Long id) {
		return repo.deleteTicket(id);
	}

	public Ticket addTicket(Ticket ticket) {
		return repo.addTicket(ticket);
	}
	
	public List<Ticket> getTickets() {
		return repo.getTickets();
	}

}

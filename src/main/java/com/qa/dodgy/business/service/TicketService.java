package com.qa.dodgy.business.service;

import javax.inject.Inject;

import com.qa.dodgy.business.repository.ITicketRepository;
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

}

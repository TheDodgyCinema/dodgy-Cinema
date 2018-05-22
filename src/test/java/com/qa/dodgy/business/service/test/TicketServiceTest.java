package com.qa.dodgy.business.service.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.dodgy.business.repository.TicketRepositoryDB;
import com.qa.dodgy.business.service.TicketService;
import com.qa.dodgy.persistence.domain.Movie;
import com.qa.dodgy.persistence.domain.Ticket;

@RunWith(MockitoJUnitRunner.class)
public class TicketServiceTest {

	@InjectMocks
	private TicketService service = new TicketService();
	
	@Mock
	private TicketRepositoryDB repo = new TicketRepositoryDB();
	
	private HashMap<Long, Ticket> ticketDB = new HashMap<Long, Ticket>();
	
	@Before
	public void setUp() {
		service.setRepo(repo);
		ticketDB.put(0L, new Ticket());
		ticketDB.put(1L, new Ticket());
	}

	@Test
	public void getTicketTest() {
		long id = 0;
		Ticket ticket = ticketDB.get(id);
		when(repo.getTicket(id)).thenReturn(ticket);
		assertEquals(ticketDB.get(id), service.getTicket(id));
	}

}

package com.qa.dodgy.business.service.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.dodgy.business.repository.SeatRepositoryDB;
import com.qa.dodgy.business.service.SeatService;
import com.qa.dodgy.persistence.domain.Movie;
import com.qa.dodgy.persistence.domain.Screen;
import com.qa.dodgy.persistence.domain.Seat;


@RunWith(MockitoJUnitRunner.class)
public class SeatServiceTest {

	@InjectMocks
	private SeatService service = new SeatService();
	
	@Mock
	private SeatRepositoryDB repo = new SeatRepositoryDB();
	
	private HashMap<Long, Seat> seatDB = new HashMap<Long, Seat>();
	
	@Before
	public void setUp() {
		service.setRepo(repo);
		Screen screen = new Screen();
		seatDB.put(0L, new Seat("Under the Skin", "15", "None", screen));
		seatDB.put(1L, new Seat("Under the Skin", "15", "None", screen));
	}
	
	@Test
	public void getSeatTest() {
		long id = 0;
		Seat seat = seatDB.get(id);
		when(repo.getSeat(id)).thenReturn(seat);
		assertEquals(seatDB.get(id), service.getSeat(id));
	}
	
	@Test
	public void deleteSeatTest() {
		long id = 0;
		Seat seat = seatDB.get(id);
		when(repo.deleteSeat(id)).thenReturn(seat).thenReturn(null);
		assertEquals(seat, service.deleteSeat(0L));
		assertEquals(null, service.deleteSeat(0L));
	}
	
	@Test
	public void getSeatsTest() {
		List<Seat> seats = new ArrayList<Seat>(seatDB.values());
		when(repo.getSeats()).thenReturn(seats);
		assertEquals(seats, service.getSeats());
	}

}

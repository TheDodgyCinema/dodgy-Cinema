package com.qa.dodgy.business.service.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.dodgy.persistence.domain.Movie;
import com.qa.dodgy.persistence.domain.Screen;
import com.qa.dodgy.persistence.domain.Showing;


@RunWith(MockitoJUnitRunner.class)
public class ShowingServiceTest {

	@InjectMocks
	private ShowingService service = new ShowingService();
	
	@Mock
	private ShowingRepositoryDB repo = new ShowingRepositoryDB();
	
	private HashMap<Long, Showing> showingDB = new HashMap<Long, Showing>();
	
	@Before
	public void setUp() {
		service.setRepo(repo);
		Movie movie = new Movie();
		Screen screen = new Screen();
		showingDB.put(0L, new Showing("3pm", "3", "3D", movie, screen));
		showingDB.put(1L, new Showing("4pm", "4", "2D", movie, screen));
	}
	
	@Test
	public void getShowingTest() {
		long id = 0;
		Showing showing = showingDB.get(id);
		when(repo.getShowing(id)).thenReturn(showing);
		assertEquals(showingDB.get(id), service.getShowing(id));
	}

}

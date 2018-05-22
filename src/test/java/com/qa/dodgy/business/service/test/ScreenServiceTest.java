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

import com.qa.dodgy.business.repository.ScreenRepositoryDB;
import com.qa.dodgy.business.service.ScreenService;
import com.qa.dodgy.persistence.domain.Screen;

@RunWith(MockitoJUnitRunner.class)
public class ScreenServiceTest {

	@InjectMocks
	private ScreenService service = new ScreenService();
	
	@Mock
	private ScreenRepositoryDB repo = new ScreenRepositoryDB();
	
	private HashMap<Long, Screen> screenDB = new HashMap<Long, Screen>();
	
	@Before
	public void setUp() {
		service.setRepo(repo);
		screenDB.put(0L, new Screen("3", "15", "Imax"));
		screenDB.put(1L, new Screen("2", "18", "Standard"));
	}
	
	@Test
	public void getScreenTest() {
		long id = 0;
		Screen screen = screenDB.get(id);
		when(repo.getScreen(id)).thenReturn(screen);
		assertEquals(screenDB.get(id), service.getScreen(id));
	}

}

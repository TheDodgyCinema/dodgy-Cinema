package com.qa.dodgy.util.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.dodgy.persistence.domain.Movie;
import com.qa.dodgy.util.OmdbWebServiceClient;

public class OmdbWebServiceClientTest {
	
	private OmdbWebServiceClient client;
	private String movieId = "tt1441395";

	@Before
	public void setUp() throws Exception {
		client = new OmdbWebServiceClient();
	}

	@Test
	public void testGetMovie() {
		assertEquals(new Movie(), client.getMovie(movieId));
		fail("Not yet implemented");
	}

}

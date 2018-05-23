package com.qa.dodgy.util.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.dodgy.persistence.domain.Movie;
import com.qa.dodgy.util.JSONUtil;


public class JSONUtilTest {
	
	private static final String MOCK_OBJECT = "{\"title\":\"IT\",\"rating\":\"18\",\"subtitles\":true,\"releaseYear\":\"2017\",\"director\":\"Andy Muschietti\",\"actors\":\"Jaeden Lieberher\",\"reviews\":\"Good\"}";

	private JSONUtil util;
	
	@Before
	public void setUp() {
		util = new JSONUtil();
	}
	
	@Test
	public void movieConversionToJSONTest() {
		Movie movie = new Movie("IT", "18", true, "2017", "Andy Muschietti", "Jaeden Lieberher", "Good");
		String MovieAsJson = util.getJSONForObject(movie);
		//System.out.println(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, MovieAsJson);
	}

}

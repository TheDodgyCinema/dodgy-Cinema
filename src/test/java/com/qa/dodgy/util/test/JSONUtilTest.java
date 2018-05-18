package com.qa.dodgy.util.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.dodgy.persistence.domain.Movie;
import com.qa.dodgy.util.JSONUtil;


public class JSONUtilTest {
	
	private JSONUtil util;
	
	@Before
	public void setup() {
		util = new JSONUtil();
	}
	
	private static final String MOCK_OBJECT = "{\"title\":\"IT\",\"rating\":\"18\",\"subtitles\":\"English\",\"releaseYear\":\"2017\",\"director\":\"Andy Muschietti\",\"actors\":\"Jaeden Lieberher\",\"reviews\":\"Good\"}";

	@Test
	public void movieConversionToJSONTest() {
		Movie movie = new Movie("IT", "18", "English", "2017", "Andy Muschietti", "Jaeden Lieberher", "Good");
		String MovieAsJson = util.getJSONForObject(movie);
		assertEquals(MOCK_OBJECT, MovieAsJson);
	}

}

package com.qa.dodgy.business.service.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.dodgy.business.repository.MovieRepositoryDB;
import com.qa.dodgy.business.service.MovieService;
import com.qa.dodgy.persistence.domain.Movie;

@RunWith(MockitoJUnitRunner.class)
public class MovieServiceTest {

	@InjectMocks
	private MovieService service = new MovieService();
	
	@Mock
	private MovieRepositoryDB repo = new MovieRepositoryDB();
	
	private HashMap<Long, Movie> movieDB = new HashMap<Long, Movie>();
	
	@Before
	public void setUp() {
		service.setRepo(repo);
		movieDB.put(0L, new Movie("Under the Skin", "15", false, "2014", "Jonathan Glazer", "Scarlett Johansson", "Good" ));
		movieDB.put(1L, new Movie("La Haine", "18", true, "1996", "Mathieu Kassovitz", "Vincent Cassel", "Excellent"));
	}

	@Test
	public void getMoviesTest() {
		List<Movie> movies = new ArrayList<Movie>(movieDB.values());
		when(repo.getMovies()).thenReturn(movies);
		assertEquals(movies, service.getMovies());
	}
	
	@Test
	public void getMovieTest() {
		long id = 0;
		Movie movie = movieDB.get(id);
		when(repo.getMovie(id)).thenReturn(movie);
		assertEquals(movieDB.get(id), service.getMovie(id));
	}
	
	@Test
	public void deleteMovieTest() {
		long id = 0;
		Movie movie = movieDB.get(id);
		when(repo.deleteMovie(id)).thenReturn(movie).thenReturn(null);
		assertEquals(movie, service.deleteMovie(0L));
		assertEquals(null, service.deleteMovie(0L));
	}
}

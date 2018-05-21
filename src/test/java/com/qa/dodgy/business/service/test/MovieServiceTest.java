package com.qa.dodgy.business.service.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
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
	
	private List<Movie> movies;
	
	@Before
	public void setUp() {
		service.setRepo(repo);
		movies = new ArrayList<Movie>();
		movies.add(new Movie("IT", "18", "English", "2017", "Andy Muschietti", "Jaeden Lieberher", "Good"));
		movies.add(new Movie("ID", "19", "Bnglish", "2018", "Bndy Muschietti", "Yaeden Lieberher", "Goof"));
	}

	@Test
	public void getMoviesTest() {
		when(repo.getMovies()).thenReturn(movies);
		assertEquals(movies, service.getMovies());
	}
	
	@Test
	public void getMovieTest() {
		when(repo.getMovie(anyLong())).thenReturn(movies.get(0));
		assertEquals(movies.get(0), service.getMovie(1L));
	}
}

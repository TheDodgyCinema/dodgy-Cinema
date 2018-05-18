package com.qa.dodgy.interoperability;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.dodgy.business.service.IMovieService;
import com.qa.dodgy.util.IJSONUtil;

@Path("movie")
public class MovieEndpoint {
	@Inject
	private IMovieService service;
	
	@Inject
	private IJSONUtil jsonUtil;

	@GET
	@Produces("application/json")
	public String getMovies() {
		return jsonUtil.getJSONForObject(service.getMovies());
	}

}

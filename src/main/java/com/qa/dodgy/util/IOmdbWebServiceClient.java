package com.qa.dodgy.util;

import com.qa.dodgy.persistence.domain.Movie;

public interface IOmdbWebServiceClient {
	Movie getMovie(String movieId);
}

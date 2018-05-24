package com.qa.dodgy.util;

import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import com.qa.dodgy.persistence.domain.Movie;
import com.qa.dodgy.util.IJSONUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class OmdbWebServiceClient implements IOmdbWebServiceClient {
	
	private static final String omdbApiUrl = "http://www.omdbapi.com/";
	private static final String apiKey = "438c7ffb";
	
	private IJSONUtil jsonUtil = new JSONUtil();
	
	private String constructRequestUrl(Map<String, String> params) {
		String requestUrl = String.format("%s?apikey=%s", omdbApiUrl, apiKey);
		for (String key : params.keySet()) {
			requestUrl += String.format("&%s=%s", key, params.get(key));
		}
		return requestUrl;
	}
	
	private String sendGetRequest(String requestUrl) {
		StringBuffer response = new StringBuffer();
		
		try {
			URL url = new URL(requestUrl);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "*/*");
			connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			InputStream stream = connection.getInputStream();
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line;
			while((line = buffer.readLine()) !=null) {
				response.append(line);
			}
			buffer.close();
			connection.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return response.toString();
	}
	
	public Movie getMovie(String movieId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("i", movieId);
		String requestUrl = constructRequestUrl(params);
		String responseJson = sendGetRequest(requestUrl);
		OmdbMovie omdbMovie = jsonUtil.getObjectForJSON(responseJson, OmdbMovie.class);
		return omdbMovie.toMovie();
	}
	
	class OmdbMovie {
		private String Title;
		private String Year;
		private String Rated;
		private String Released;
		private String Runtime;
		private String Genre;
		private String Director;
		private String Writer;
		private String Actors;
		private String Plot;
		private String Language;
		private String Country;
		private String Awards;
		private String Poster;
		private Collection<Object> Ratings;
		private String Metascore;
		private String imdbRating;
		private String imdbVotes;
		private String imdbID;
		private String Type;
		private String DVD;
		private String BoxOffice;
		private String Production;
		private String Website;
		private String Response;
		
		public OmdbMovie(String title, String year, String rated, String released, String runtime, String genre,
				String director, String writer, String actors, String plot, String language, String country,
				String awards, String poster, Collection<Object> ratings, String metascore, String imdbRating, String imdbVotes,
				String imdbID, String type, String dVD, String boxOffice, String production, String website,
				String response) {
			
			super();
			
			Title = title;
			Year = year;
			Rated = rated;
			Released = released;
			Runtime = runtime;
			Genre = genre;
			Director = director;
			Writer = writer;
			Actors = actors;
			Plot = plot;
			Language = language;
			Country = country;
			Awards = awards;
			Poster = poster;
			Ratings = ratings;
			Metascore = metascore;
			this.imdbRating = imdbRating;
			this.imdbVotes = imdbVotes;
			this.imdbID = imdbID;
			Type = type;
			DVD = dVD;
			BoxOffice = boxOffice;
			Production = production;
			Website = website;
			Response = response;
		}
		
		private Movie toMovie() {
			Boolean subtitles = !Language.equals("English");
			return new Movie(Title, Rated, subtitles, Year, Director, Actors,
			imdbRating);
		}
	}
}
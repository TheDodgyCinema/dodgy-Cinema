package com.qa.dodgy.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {

	public Movie(String title, String rating, String subtitles, String releaseYear, String director, String actors,
			String reviews) {
		
		this.title = title;
		this.rating = rating;
		this.subtitles = subtitles;
		this.releaseYear = releaseYear;
		this.director = director;
		this.actors = actors;
		this.reviews = reviews;
	}

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String rating;
	private String subtitles;
	private String releaseYear;
	private String director;
	private String actors;
	private String reviews;
	private String posterUrl;
	
	public Movie() {
		super();
	}
	
	public String getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSubtitles() {
		return subtitles;
	}

	public void setSubtitles(String subtitles) {
		this.subtitles = subtitles;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
}

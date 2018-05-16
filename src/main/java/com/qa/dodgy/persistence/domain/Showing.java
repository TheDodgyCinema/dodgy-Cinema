package com.qa.dodgy.persistence.domain;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.io.Serializable;

@Entity
public class Showing{
	
	
	@Id
	@GeneratedValue
	private Long id;
	private String startTime;
	private String screenNumber;
	private String dimension;
	
	@ManyToOne
	private Movie movie;
	
	@ManyToOne
	private Screen screen;
	
	public Showing() {
		super();
	}
	
	public Showing(Long id, String startTime, String screenNumber, String dimension) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.screenNumber = screenNumber;
		this.dimension = dimension;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getScreenNumber() {
		return screenNumber;
	}

	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

}

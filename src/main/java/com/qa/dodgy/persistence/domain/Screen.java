package com.qa.dodgy.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Screen {
	
	@Id
	@GeneratedValue
	private Long id;
	private String numberofSeats;
	private String screenNumber;
	private String screenType;
	
	public Long getId() {
		return id;
	}

	public String getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(String numberofSeats) {
		this.numberofSeats = numberofSeats;
	}

	public String getScreenNumber() {
		return screenNumber;
	}

	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
}

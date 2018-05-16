package com.qa.dodgy.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Seat {
	
	@Id
	@GeneratedValue
	private Long id;
	private String seatNumber;
	private String seatRow;
	private String seatType;
	
	@ManyToOne
	private Screen screen;
	
	public Seat() {
		super();
	}
	
	public Seat(String seatNumber, Long id, String seatRow, String seatType) {
		super();
		this.seatNumber = seatNumber;
		this.id = id;
		this.seatRow = seatRow;
		this.seatType= seatType;
    }
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getSeatRow() {
		return seatRow;
	}

	public void setSeatRow(String seatRow) {
		this.seatRow = seatRow;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

}

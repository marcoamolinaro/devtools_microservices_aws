package com.scm.springcloud.models;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String flightNumber;
	private String operationAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Time estimatedDepartureTime;
	
	
	public Flight() {}

	public Flight(Long id, String flightNumber, String operationAirlines, String departureCity, String arrivalCity,
			Date dateOfDeparture, Time estimatedDepartureTime) {
		this.id = id;
		this.flightNumber = flightNumber;
		this.operationAirlines = operationAirlines;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperationAirlines() {
		return operationAirlines;
	}

	public void setOperationAirlines(String operationAirlines) {
		this.operationAirlines = operationAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Time getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Time estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
}

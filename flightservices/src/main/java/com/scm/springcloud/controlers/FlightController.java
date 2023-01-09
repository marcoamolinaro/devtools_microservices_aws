package com.scm.springcloud.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scm.springcloud.models.Flight;
import com.scm.springcloud.repositories.FlightRepository;

@RestController
@RequestMapping("/flightapi")
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;
	
	@GetMapping("/flights")
	public List<Flight> getFlights() {
		return flightRepository.findAll();
	}
}

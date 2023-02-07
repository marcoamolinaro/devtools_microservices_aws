package com.scm.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.springcloud.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}

package com.scm.springcloud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.springcloud.models.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}

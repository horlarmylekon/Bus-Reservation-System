package com.intellisense.BusReservationSystem.repository;

import com.intellisense.BusReservationSystem.model.Agency;
import com.intellisense.BusReservationSystem.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {

    List<Trip> findByAgencies(Agency agency);

}

package com.intellisense.BusReservationSystem.repository;

import com.intellisense.BusReservationSystem.model.Trip;
import com.intellisense.BusReservationSystem.model.TripSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripScheduleRepository extends JpaRepository<TripSchedule, Long> {

    TripSchedule findByTripDetailAndTripDate(Trip tripDetails, String tripDate);
}

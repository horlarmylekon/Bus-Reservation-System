package com.intellisense.BusReservationSystem.repository;

import com.intellisense.BusReservationSystem.model.Agency;
import com.intellisense.BusReservationSystem.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

    Bus findByPlateNumber(String plateNumber);

    Bus findByPlateNumberAndAgency(String plateNumber, Agency agency);
}

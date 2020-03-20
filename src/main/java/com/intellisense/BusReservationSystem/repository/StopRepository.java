package com.intellisense.BusReservationSystem.repository;

import com.intellisense.BusReservationSystem.model.Stop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopRepository extends JpaRepository<Stop, Long> {

    Stop findByCode(String code);
}

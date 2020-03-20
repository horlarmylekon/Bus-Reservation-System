package com.intellisense.BusReservationSystem.repository;

import com.intellisense.BusReservationSystem.model.Agency;
import com.intellisense.BusReservationSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgencyRepository extends JpaRepository<Agency,Long> {

    Agency findByName(String name);

    Agency findByCode(String code);

    Agency findByOwner(User owner);
}

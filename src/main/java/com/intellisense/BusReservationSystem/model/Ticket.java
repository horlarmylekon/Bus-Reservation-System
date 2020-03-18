package com.intellisense.BusReservationSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TICKET")
public class Ticket extends AbstractEntity{

    @Column(name = "seatNumber", nullable = false)
    private String seatNumber;

    @Column(name = "cancelDate", nullable = false)
    private Boolean cancellable;

    @Column(name = "journeyDate", nullable = false)
    private String journeyDate;

    @OneToMany
    private User passenger;

    private TripSchedule tripSchedule;
}

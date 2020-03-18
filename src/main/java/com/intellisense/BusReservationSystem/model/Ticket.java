package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "TICKET")
public class Ticket extends AbstractEntity{

    @Column(name = "seatNumber", nullable = false)
    private String seatNumber;

    @Column(name = "cancelDate", nullable = false)
    private Boolean cancellable;

    @Column(name = "journeyDate", nullable = false)
    private String journeyDate;

    @ManyToOne
    private User passenger;

    private String tripSchedule;
}

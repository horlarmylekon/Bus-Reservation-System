package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Ticket")
@Access(value = AccessType.FIELD)
public class Ticket extends AbstractEntity{

    @Column(name = "seatNumber", nullable = false)
    private int seatNumber;

    @Column(name = "cancelDate", nullable = false)
    private boolean cancellable;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "journeyDate", nullable = false)
    private Date journeyDate;

    @ManyToOne
    private User passenger;

    @ManyToOne
    private TripSchedule tripSchedule;
}

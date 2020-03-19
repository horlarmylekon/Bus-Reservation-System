package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "TripSchedule")
@Access(value = AccessType.FIELD)
public class TripSchedule extends AbstractEntity{

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tripDate", nullable = false)
    private Date tripDate;

    @Column(name = "availableSeats", nullable = false)
    private int availableSeats;


    @OneToOne
    private Trip tripDetail;

    @OneToMany
    private List<Ticket> ticketsSold;
}

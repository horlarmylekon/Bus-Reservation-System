package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TripShedule")
public class TripSchedule extends AbstractEntity{

    @Column(name = "tripDate", nullable = false)
    private String tripDate;

    @Column(name = "availableSeats", nullable = false)
    private int availableSeats;

    @Column(name = "tripDetails", nullable = false)
    private String tripDetails;

    @Column(name = "ticketSold", nullable = false)
    private String ticketSold;
}

package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Trip")
@Access(value = AccessType.FIELD)
public class Trip extends AbstractEntity{

    @Column(name = "fare", nullable = false)
    private Double fare;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "journeyTime", nullable = false)
    private Date journeyTime;

    @OneToMany
    @JoinColumn(name = "bus_id")
    private Set<Bus> buses;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "trips")
    private Set<Agency> agencies;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "route_id")
    private Route route;

    @OneToOne
    private TripSchedule tripSchedule;



}

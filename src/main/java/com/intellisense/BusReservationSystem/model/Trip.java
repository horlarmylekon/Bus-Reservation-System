package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;
import java.math.RoundingMode;
import java.util.List;

@Entity
@Table(name = "Trip")
public class Trip extends AbstractEntity{

    @Column(name = "fare", nullable = false)
    private Double fare;

    @Column(name = "journeyTime", nullable = false)
    private String journeyTime;

    @OneToMany
    @JoinColumn(name = "bus-id")
    private List<Bus> bus;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "trips")
    private List<Agency> agencies;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "route_id")
    private Route route;

    @OneToOne
    private TripSchedule tripSchedule;



}

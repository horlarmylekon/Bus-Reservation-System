package com.intellisense.BusReservationSystem.model;

import org.springframework.util.StopWatch;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "route")
public class Route extends AbstractEntity{

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "route")
    private List<Trip> trips;

    @OneToOne
    @JoinColumn(name = "source_stop_id")
    private Stop source; // sourceStop and destinationSource

    @OneToOne
    @JoinColumn(name = "destination_stop_id")
    private Stop destination; // destinationSource

}

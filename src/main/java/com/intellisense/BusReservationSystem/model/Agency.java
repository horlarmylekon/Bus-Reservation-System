package com.intellisense.BusReservationSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Agency")
@Access(value = AccessType.FIELD)
public class Agency extends AbstractEntity {

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "details", nullable = false)
    private String details;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User owner;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "agency", orphanRemoval = true)
    @JsonIgnore
    private Set<Bus> buses;

    @ManyToMany
    @JoinTable(name = "agency_trip", joinColumns = @JoinColumn(name = "agency_id")
            ,inverseJoinColumns = @JoinColumn(name = "trip_id"))
    private List<Trip> trips;


}

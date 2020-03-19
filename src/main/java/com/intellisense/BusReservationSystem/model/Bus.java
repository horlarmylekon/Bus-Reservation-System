package com.intellisense.BusReservationSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Bus")
@Access(value = AccessType.FIELD)
public class Bus extends AbstractEntity {

    @Column(name = "plateNumber", nullable = false, unique = true)
    private String plateNumber;

    @Column(name = "capacity", nullable = false)
    private int capacity;

    @Column(name = "type", nullable = false)
    private String type;

    @ManyToOne
    @JoinColumn(name = "agency_id", nullable = false)
    private Agency agency;

    @ManyToOne
    @JsonIgnore
    private Trip trip;


}

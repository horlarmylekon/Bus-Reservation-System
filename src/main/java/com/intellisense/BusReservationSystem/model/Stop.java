package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "Stop")
public class Stop extends AbstractEntity{

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "details", nullable = false)
    private String details;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "source", orphanRemoval = true)
    private Route route;


}

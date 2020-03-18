package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "Trip")
public class Trip extends AbstractEntity{

    @Column(name = "fare", nullable = false)
    private Double fare;

    @Column(name = "journeyTime", nullable = false)
    private String journeyTime;

    @Column(name = "sourceStop", nullable = false)
    private String sourceStop;

    @Column(name = "destinationStop", nullable = false)
    private String destinationStop;

    @OneToOne
    private Bus bus;

    @ManyToOne
    private Agency agency;
}

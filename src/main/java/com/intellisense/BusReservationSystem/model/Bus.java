package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "Bus")
public class Bus extends AbstractEntity {

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "capacity", nullable = false)
    private String capacity;

    @Column(name = "type", nullable = false)
    private String type;

    @OneToMany
    private Agency agencyId;
}

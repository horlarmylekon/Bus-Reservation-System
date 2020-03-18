package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "Role")
public class Role extends AbstractEntity{

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToOne
    private User user;
}

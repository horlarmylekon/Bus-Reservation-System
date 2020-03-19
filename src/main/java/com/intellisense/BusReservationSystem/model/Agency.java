package com.intellisense.BusReservationSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Agency")
public class Agency extends AbstractEntity {

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "details", nullable = false)
    private String details;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "agency", orphanRemoval = true)
    @JsonIgnore
    private List<Bus> bus;

    @ManyToMany
    @JoinTable(name = "agency_trip", joinColumns = @JoinColumn(name = "agency_id")
            ,inverseJoinColumns = @JoinColumn(name = "trip_id"))
    private List<Trip> trips;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

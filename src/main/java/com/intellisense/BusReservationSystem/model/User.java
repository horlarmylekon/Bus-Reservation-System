package com.intellisense.BusReservationSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "User")
public class User extends AbstractEntity{

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    @Email(message = "Please provide your email")
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    private Set<Role> roles;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "user", orphanRemoval = true)
    @JsonIgnore
    private List<Agency> agencies;

    @OneToMany
    private List<Ticket> ticket;
}

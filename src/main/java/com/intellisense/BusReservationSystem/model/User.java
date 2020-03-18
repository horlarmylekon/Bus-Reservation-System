package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

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

    @OneToOne
    private Role role;
}

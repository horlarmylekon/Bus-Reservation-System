package com.intellisense.BusReservationSystem.dto;

import java.util.Set;

public class UserDto {
    /*
    DTOs are not meant to be the mirror image of their
    model counterparts, rather they should be a reflection of what the user
    interface or the api response demands
     */
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private boolean isAdmin;
    private Set<RoleDto> roles;

}

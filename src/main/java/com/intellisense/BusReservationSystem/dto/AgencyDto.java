package com.intellisense.BusReservationSystem.dto;

import java.util.Set;

public class AgencyDto {
    /*
    DTOs are not meant to be the mirror image of their
    model counterparts, rather they should be a reflection of what the user
    interface or the api response demands
     */
    private Long id;
    private String code;
    private UserDto owner;
    private Set<BusDto> buses;
    private String name;
    private String details;
}

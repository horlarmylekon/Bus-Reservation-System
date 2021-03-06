package com.intellisense.BusReservationSystem.dto;

public class TicketDto {
    /*
    DTOs are not meant to be the mirror image of their
    model counterparts, rather they should be a reflection of what the user
    interface or the api response demands
     */
    private Long id;
    private int seatNumber;
    private boolean cancellable;
    private String journeyDate;
    private String sourceStop;
    private String destinationStop;
    private String passengerName;
    private String passengerMobileNumber;
}

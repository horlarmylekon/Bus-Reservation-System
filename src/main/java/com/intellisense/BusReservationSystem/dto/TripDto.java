package com.intellisense.BusReservationSystem.dto;

public class TripDto {

    /*
    DTOs are not meant to be the mirror image of their
    model counterparts, rather they should be a reflection of what the user
    interface or the api response demands
     */
    private Long id;
    private Double fare;
    private int journeyTime;
    private String sourceStopCode;
    private String sourceStopName;
    private String destinationStopCode;
    private String destinationStopName;
    private String busCode;
    private String agencyCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public int getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(int journeyTime) {
        this.journeyTime = journeyTime;
    }

    public String getSourceStopCode() {
        return sourceStopCode;
    }

    public void setSourceStopCode(String sourceStopCode) {
        this.sourceStopCode = sourceStopCode;
    }

    public String getSourceStopName() {
        return sourceStopName;
    }

    public void setSourceStopName(String sourceStopName) {
        this.sourceStopName = sourceStopName;
    }

    public String getDestinationStopCode() {
        return destinationStopCode;
    }

    public void setDestinationStopCode(String destinationStopCode) {
        this.destinationStopCode = destinationStopCode;
    }

    public String getDestinationStopName() {
        return destinationStopName;
    }

    public void setDestinationStopName(String destinationStopName) {
        this.destinationStopName = destinationStopName;
    }

    public String getBusCode() {
        return busCode;
    }

    public void setBusCode(String busCode) {
        this.busCode = busCode;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }
}

package com.flightsearchback.flightsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Segment {
    private Flight departure;
    private Flight arrival;
    private String carrierCode;
    private String number;
    private String duration;
    private String id;
    public Segment(Flight departure, Flight arrival, String carrierCode, String number, String duration, String id) {
        this.departure = departure;
        this.arrival = arrival;
        this.carrierCode = carrierCode;
        this.number = number;
        this.duration = duration;
        this.id = id;
    }
    public Segment() {
    }
    public Flight getDeparture() {
        return departure;
    }
    public void setDeparture(Flight departure) {
        this.departure = departure;
    }
    public Flight getArrival() {
        return arrival;
    }
    public void setArrival(Flight arrival) {
        this.arrival = arrival;
    }
    public String getCarrierCode() {
        return carrierCode;
    }
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Segment [departure=" + departure + ", arrival=" + arrival + ", carrierCode=" + carrierCode + ", number="
                + number + ", duration=" + duration + ", id=" + id + "]";
    }
    
}
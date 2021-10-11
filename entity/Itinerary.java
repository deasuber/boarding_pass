package com.example.demo.entity;

import javax.persistence.*;

//Itinerary Entity
@Entity //This will let Java know that this is an entity that we are going to map to a database table.
@Table(name = "itinerary") //This is for the actual name of the database table we are mapping to the class.
public class Itinerary {

        //Define fields
        @Id //This will map the primary key.
        @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
        @Column(name = "itinerary_id") //This is mapping the primary key to the itineraryId column in the table.
        private int itineraryId;

        @Column(name = "travel_date") //This will map the travelDate field to the column named travel_date in the table.
        private String travelDate;

        @Column(name = "origin") //This will map the origin field to the column named origin in the table.
        private String origin;

        @Column(name = "destination") //This will map the destination field to the column named destination in the table.
        private String destination;

        @Column(name = "departure_time") //This is mapping the departureTime field to the column named departure_time in the table.
        private int departureTIme;

        @Column(name = "eta") //This will map the eta field to the column named eta in the table.
        private int eta;

    public Itinerary(int itineraryId, String travelDate, String origin, String destination) {
        this.itineraryId = itineraryId;
        this.travelDate = travelDate;
        this.origin = origin;
        this.destination = destination;
    }

    //getter/setters

    public int getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDepartureTIme() {
        return departureTIme;
    }

    public void setDepartureTIme(int departureTIme) {
        this.departureTIme = departureTIme;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    //ToStringMMethod

    @Override
    public String toString() {
        return "Itinerary{" +
                "itineraryId=" + itineraryId +
                ", travelDate='" + travelDate + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTIme=" + departureTIme +
                ", eta=" + eta +
                '}';
    }
}

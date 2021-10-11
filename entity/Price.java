package com.example.demo.entity;

import javax.persistence.*;

//Price Entity
@Entity //This will let Java know that this is an entity that we are going to map to a database table.
@Table(name = "price") //This is for the actual name of the database table we are mapping to the class.
public class Price {

    //Define fields
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "price_id") //This is mapping the primary key to the PriceId column in the table.
    private int price_id;

    @Column(name = "itinerary_id") //This is mapping the itineraryId field to the column named itinerary_id in the table.
    private int itinerary_id;

    @Column(name = "price") //This will map the price field to the column named price in the table.
    private String price;

    // default constructor
    public Price() {

    }

    public Price(String price) {
        this.price = price;
    }

    //getter/setters

    public int getPrice_id() {
        return price_id;
    }

    public void setPrice_id(int price_id) {
        this.price_id = price_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    //ToString Method

    @Override
    public String toString() {
        return "Price{" +
                "price='" + price + '\'' +
                '}';
    }
}

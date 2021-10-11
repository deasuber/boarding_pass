package com.example.demo.entity;

import javax.persistence.*;

//Ticket Entity
@Entity //This will let Java know that this is an entity that we are going to map to a database table.
@Table(name = "ticket") //This is for the actual name of the database table we are mapping to the class.
public class Ticket {
    //Define fields
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "ticket_id") //This is mapping the primary key to the ticket_id column in the table.
    private int ticketId;

    @Column(name = "customer_id") //This is mapping the primary key to the customer_id column in the table.
    private int customerId;

    @Column(name = "itinerary_id") //This is mapping the primary key to the itinerary_id column in the table.
    private int itineraryId;

    @Column(name = "price_id") //This is mapping the primary key to the price_d column in the table.
    private int priceId;

    @Column(name = "travel_date") //This will map the travelDate field to the column named travel_date in the table.
    private String travelDate;

    @Column(name = "origin") //This will map the origin field to the column named origin in the table.
    private String origin;

    @Column(name = "destination") //This will map the destination field to the column named destination in the table.
    private String destination;

    @Column(name = "departure_time") //This is mapping the departure_time field to the column named departure_time in the table.
    private int departureTime;

    @Column(name = "eta") //This will map the eta field to the column named eta in the table.
    private int eta;

    @Column(name = "first_name") //This will map the firstName field to the column named first_name in the table.
    private String firstName;

    @Column(name = "last_name") //This will map the lastName field to the column named last_name in the table.
    private String lastName;

    @Column(name = "email") //This will map the email field to the column named email in the table.
    private String email;

    @Column(name = "phone") //This is mapping the phone field to the column named phone in the table.
    private int phone;

    @Column(name = "gender") //This will map the gender field to the column named gender in the table.
    private String gender;

    @Column(name = "age") //This is mapping the age field to the column named age in the table.
    private int age;

    @Column(name = "purchase_date") //This is mapping the purchaseDate field to the column named purchase_date in the table.
    private int purchaseDate;

    @Column(name = "quantity") //This is mapping the quantity field to the column named quantity in the table.
    private int quantity;

    @Column(name = "price") //This is mapping the price field to the column named price in the table.
    private int price;

    @Column(name = "final_price") //This is mapping the finalPrice field to the column named final_price in the table.
    private int finalPrice;

    //default constructor
    public Ticket(){
    }

    public Ticket(int ticket_id, int customer_id, int priceId, String travelDate, String origin, String destination, int departureTIme, int eta, String firstName, String lastName) {
        this.ticketId = ticket_id;
        this.customerId = customer_id;
        this.priceId = priceId;
        this.travelDate = travelDate;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.eta = eta;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getter/setters


    public int getTicket_id() {
        return ticketId;
    }

    public void setTicket_id(int ticket_id) {
        this.ticketId = ticket_id;
    }

    public int getCustomer_id() {
        return customerId;
    }

    public void setCustomer_id(int customer_id) {
        this.customerId = customer_id;
    }

    public int getPriceId() {
        return priceId;
    }

    public void setPriceId(int priceId) {
        this.priceId = priceId;
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
        return departureTime;
    }

    public void setDepartureTIme(int departureTIme) {
        this.departureTime = departureTIme;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFinal_price() {
        return finalPrice;
    }

    public void setFinal_price(int final_price) {
        this.finalPrice = final_price;
    }

    //ToString Method

    @Override
    public String toString() {
        return "Ticket{" +
                "ticket_id=" + ticketId +
                ", customer_id=" + customerId +
                ", priceId=" + priceId +
                ", travelDate='" + travelDate + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTIme=" + departureTime +
                ", eta=" + eta +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", purchaseDate=" + purchaseDate +
                ", quantity=" + quantity +
                ", price=" + price +
                ", final_price=" + finalPrice +
                '}';
    }
}



package com.example.demo.entity;

import javax.persistence.*;

//Customer Entity
@Entity//This will let Java know that this is an entity that we are going to map to a database table.
@Table(name = "customer")//This is for the actual name of the database we are mapping to the class.
public class Customer {

    //Define fields
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "customer_id") //This is mapping the primary key to the customerId column in the table.
    private int customerId;

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

    //default constructor
    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //getter/setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}




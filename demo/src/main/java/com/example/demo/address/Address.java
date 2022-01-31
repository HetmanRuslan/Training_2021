package com.example.demo.address;

import javax.persistence.*;

@Entity
@Table
public class Address {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String state;
    private int zip;
    private int aptNumber;
    private String name;

    public Address(){}

    public Address(Long id, String city, String state, int zip, int aptNumber, String name) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.aptNumber = aptNumber;
        this.name = name;
    }

    public Address(String city, String state, int zip, int aptNumber, String name) {
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.aptNumber = aptNumber;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(int aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", aptNumber=" + aptNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

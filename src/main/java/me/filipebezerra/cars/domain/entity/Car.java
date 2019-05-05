package me.filipebezerra.cars.domain.entity;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String brand;

    private String model;

    private String color;

    private String registeredNumber;

    private int year;

    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Car() {}

    public Car(final String brand, final String model, final String color, final String registeredNumber,
               final int year, final int price, final Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registeredNumber = registeredNumber;
        this.year = year;
        this.price = price;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(final String registeredNumber) {
        this.registeredNumber = registeredNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(final Owner owner) {
        this.owner = owner;
    }

}

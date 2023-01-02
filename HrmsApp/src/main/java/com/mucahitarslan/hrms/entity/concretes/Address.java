package com.mucahitarslan.hrms.entity.concretes;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String district;
    private String neighborhood; // Mahalle
    private String road; // Cadde
    private String apartmentBuilding;
    private int floor;
    private int apartmentNumber;

    @ManyToOne
    private Provience provience;

    @ManyToOne
    private User user;

    public Address() {
    }

    public Address(long id, String district, String neighborhood, String road, String apartmentBuilding, int floor, int apartmentNumber) {
        this.id = id;
        this.district = district;
        this.neighborhood = neighborhood;
        this.road = road;
        this.apartmentBuilding = apartmentBuilding;
        this.floor = floor;
        this.apartmentNumber = apartmentNumber;
    }

    public Provience getProvience() {
        return provience;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getApartmentBuilding() {
        return apartmentBuilding;
    }

    public void setApartmentBuilding(String apartmentBuilding) {
        this.apartmentBuilding = apartmentBuilding;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}

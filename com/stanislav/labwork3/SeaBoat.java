package com.stanislav.labwork3;

import java.util.Objects;

public class SeaBoat {
    private String name;
    private String type;
    private double length;
    private int capacity;
    private double maxSpeed;

    public SeaBoat(String name, String type, double length, int capacity, double maxSpeed) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    //просто для "краси"
    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    //просто для "краси"
    public int getCapacity() {
        return capacity;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeaBoat)) return false;
        SeaBoat seaBoat = (SeaBoat) o;
        return Double.compare(seaBoat.length, length) == 0 &&
                capacity == seaBoat.capacity &&
                Double.compare(seaBoat.maxSpeed, maxSpeed) == 0 &&
                Objects.equals(name, seaBoat.name) &&
                Objects.equals(type, seaBoat.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, length, capacity, maxSpeed);
    }

    @Override
    public String toString() {
        return "SeaBoat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                ", capacity=" + capacity +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
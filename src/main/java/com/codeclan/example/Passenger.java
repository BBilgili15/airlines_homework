package com.codeclan.example;

public class Passenger extends Person {
    private int numOfBags;
    private Flight flight;

    public Passenger(String name, int numOfBags, Flight flight) {
        super(name);
        this.numOfBags = numOfBags;
        this.flight = flight;
    }

    public int bagCount() {
        return numOfBags;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setNumOfBags(int numOfBags) {
        this.numOfBags = numOfBags;
    }



}

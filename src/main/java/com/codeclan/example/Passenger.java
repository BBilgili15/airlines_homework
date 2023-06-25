package com.codeclan.example;

public class Passenger extends Person {
    private int numOfBags;

    public Passenger(String name, int numOfBags) {
        super(name);
        this.numOfBags = numOfBags;
    }

    public int bagCount() {
        return numOfBags;
    }

    public void setNumOfBags(int numOfBags) {
        this.numOfBags = numOfBags;
    }
}

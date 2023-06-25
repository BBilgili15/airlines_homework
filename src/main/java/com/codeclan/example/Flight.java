package com.codeclan.example;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int totalWeightAllowance;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CrewMember> crewMembers, ArrayList<Passenger> passengers, String flightNumber, String destination, String departureAirport, String departureTime, int totalWeightAllowance) {
        this.pilots = pilots;
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.totalWeightAllowance = totalWeightAllowance;
    }

    public int getPassengers() {
        return passengers.size();
    }

    public int countAvailableSeats() {
        return 10 - passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (this.passengers.size() < 10) {
            this.passengers.add(passenger);
        }
    }

    public int weightRemaining() {
        int bags = 0;
        int passengerWeight = 0;
        for (Passenger passenger: this.passengers) {
            bags += passenger.bagCount();
            passengerWeight += 70;
        }
        int pilotWeight = 0;
        for (Pilot pilot: this.pilots) {
            pilotWeight += 70;
        }
        int crewWeight = 0;
        for (CrewMember crewMember: this.crewMembers) {
            crewWeight += 70;
        }
        int bagWeight = bags * 10;
        return this.totalWeightAllowance - ( bagWeight + passengerWeight + pilotWeight + crewWeight);

    }

}

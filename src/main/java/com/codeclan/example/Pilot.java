package com.codeclan.example;

public class Pilot extends Person {
    private CrewMemberType crewMemberType;
    private String licenseNumber;

    public Pilot(String name, CrewMemberType crewMemberType, String licenseNumber) {
        super(name);
        this.crewMemberType = crewMemberType;
        this.licenseNumber = licenseNumber;
    }

    public CrewMemberType getCrewMemberType() {
        return crewMemberType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setCrewMemberType(CrewMemberType crewMemberType) {
        this.crewMemberType = crewMemberType;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}

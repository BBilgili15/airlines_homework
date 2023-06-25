package com.codeclan.example;

public class CrewMember extends Person {
    private CrewMemberType crewMemberType;

    public CrewMember(String name, CrewMemberType crewMemberType) {
        super(name);
        this.crewMemberType = crewMemberType;
    }

    public CrewMemberType getCrewMemberType() {
        return crewMemberType;
    }

    public void setCrewMemberType(CrewMemberType crewMemberType) {
        this.crewMemberType = crewMemberType;
    }

    public String speakToPassengers() {
        return "Ladies and gentlemen, we are about to take off";
    }

}

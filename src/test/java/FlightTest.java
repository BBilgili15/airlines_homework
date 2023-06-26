import com.codeclan.example.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Pilot pilot;
    CrewMember crewMember;
    CrewMember crewMember1;
    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    Flight flight;

    @Before
    public void before() {
        ArrayList<Pilot> pilots = new ArrayList<>();
        ArrayList<CrewMember> crewMembers = new ArrayList<>();
        ArrayList<Passenger> passengers = new ArrayList<>();
        flight = new Flight(pilots, crewMembers, passengers, "56712GH", "Dakar", "Paris", 11.50, 1000);
        pilot = new Pilot("Jared", CrewMemberType.PILOT, "3TYU67");
        pilots.add(pilot);
        crewMember = new CrewMember("John", CrewMemberType.LEAD_ATTENDANT);
        crewMembers.add(crewMember);
        crewMember1 = new CrewMember("Jane", CrewMemberType.FLIGHT_ATTENDANT);
        crewMembers.add(crewMember1);
        passenger = new Passenger("Fred", 1, null);
        flight.bookPassenger(passenger);
        passenger1 = new Passenger("Bella", 0, null);
        flight.bookPassenger(passenger1);
        passenger2 = new Passenger("Martin", 2, null);
        flight.bookPassenger(passenger2);
        passenger3 = new Passenger("Amy", 2, null);
        flight.bookPassenger(passenger3);
        passenger4 = new Passenger("Alex", 0, null);
    }

    @Test
    public void canGetTotalAvailableSeats() {
        assertEquals(6, flight.countAvailableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger4);
        assertEquals(5, flight.countAvailableSeats());
    }

    @Test
    public void wontBookIfFull() {
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger4);
        assertEquals(10, flight.getPassengers());
    }

    @Test
    public void canGetRemainingWeight() {
        assertEquals(460, flight.weightRemaining());
    }
}

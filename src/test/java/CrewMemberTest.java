import com.codeclan.example.CrewMember;
import com.codeclan.example.CrewMemberType;
import com.codeclan.example.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {
    CrewMember crewMember;

    @Before
    public void before() {
        crewMember = new CrewMember("Doug", CrewMemberType.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetName() {
        assertEquals("Doug", crewMember.getName());
    }

    @Test
    public void canGetCrewMemberType() {
        assertEquals(CrewMemberType.FLIGHT_ATTENDANT, crewMember.getCrewMemberType());
    }

    @Test
    public void canSpeakToPassengers() {
        assertEquals("Ladies and gentlemen, we are about to take off", crewMember.speakToPassengers());
    }
}
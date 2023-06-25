import com.codeclan.example.CrewMemberType;
import com.codeclan.example.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("May", CrewMemberType.PILOT, "G1235T");
    }

    @Test
    public void canGetName() {
        assertEquals("May", pilot.getName());
    }

    @Test
    public void canGetCrewMemberType() {
        assertEquals(CrewMemberType.PILOT, pilot.getCrewMemberType());
    }

    @Test
    public void canGetLicenseNum() {
        assertEquals("G1235T", pilot.getLicenseNumber());
    }
}

import com.codeclan.example.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Albert", 2, null);
    }

    @Test
    public void canGetName() {
        assertEquals("Albert", passenger.getName());
    }

    @Test
    public void canGetBagCount() {
        assertEquals(2, passenger.bagCount());
    }

}

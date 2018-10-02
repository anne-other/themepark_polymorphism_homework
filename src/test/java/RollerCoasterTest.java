import org.junit.Before;
import org.junit.Test;
import rides.RollerCoaster;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setup(){
        rollerCoaster = new RollerCoaster("Nemisis", 4.99, 10, 1.5);
    }

    @Test
    public void hasName() {
        assertEquals("Nemisis", rollerCoaster.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(4.99, rollerCoaster.getPrice(), 0.01);
    }

    @Test
    public void hasMinAge() {
        assertEquals(10, rollerCoaster.getMinAge());
    }
}

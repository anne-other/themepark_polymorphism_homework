import org.junit.Before;
import rides.RollerCoaster;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setup(){
        rollerCoaster = new RollerCoaster("Nemisis", 4.99, 10, 1.5);
    }


}

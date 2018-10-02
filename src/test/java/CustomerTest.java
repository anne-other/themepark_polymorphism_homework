import org.junit.Before;
import org.junit.Test;
import rides.RollerCoaster;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Customer customer1;
    RollerCoaster rollerCoaster;

    @Before
    public void setUp() throws Exception {
        customer = new Customer(30, 1.7, 10.00);
        customer1 = new Customer(9, 1.0, 0.50);
        rollerCoaster = new RollerCoaster("Rita", 4.50, 10, 1.5);
    }

    @Test
    public void hasAge() {
        assertEquals(30, customer.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.7, customer.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(10.00, customer.getMoney(), 0.01);
    }

    @Test
    public void checksCustomerIsOldEnough() {
        boolean oldeEnough = customer.checkAge(rollerCoaster);
        assertEquals(true, oldeEnough);
    }

    @Test
    public void customerIsNotOldEnough() {
        boolean notOldEnough = customer1.checkAge(rollerCoaster);
        assertEquals(false, notOldEnough);
    }

    @Test
    public void customerIsTallEnough() {
        boolean tallEnough = customer.checkHeight(rollerCoaster);
        assertEquals(true, tallEnough);
    }

    @Test
    public void customerIsNotTallEnough() {
        boolean notTallEnough = customer1.checkHeight(rollerCoaster);
        assertEquals(false, notTallEnough);
    }

    @Test
    public void checkCanRide() {
        boolean canRide = customer.checkCanRide(rollerCoaster);
        assertEquals(true, canRide);
    }

    @Test
    public void checkCantRide() {
        boolean cantRide = customer1.checkCanRide(rollerCoaster);
        assertEquals(false, cantRide);
    }
}

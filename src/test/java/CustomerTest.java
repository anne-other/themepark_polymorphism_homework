import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer(30, 1.7, 10.00);
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
}

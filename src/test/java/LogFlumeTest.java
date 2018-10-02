import org.junit.Before;
import org.junit.Test;
import rides.LogFlume;

import static org.junit.Assert.assertEquals;

public class LogFlumeTest {

    LogFlume logFlume;

    @Before
    public void setUp() throws Exception {
        logFlume = new LogFlume("Splash Mountain", 9.99, 15, 1.7);
    }

    @Test
    public void hasName() {
        assertEquals("Splash Mountain", logFlume.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(9.99, logFlume.getPrice(), 0.01);
    }

    @Test
    public void hasMinAge() {
        assertEquals(15, logFlume.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(1.7, logFlume.getMinHeight(), 0.1);
    }

    @Test
    public void hasWaterWarning() {
        assertEquals("Warning, you will get soaked", logFlume.warning());
    }
}

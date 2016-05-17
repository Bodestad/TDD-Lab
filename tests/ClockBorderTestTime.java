/**
 * Created by gustavbodestad on 2016-05-13.
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
public class ClockBorderTestTime {
    private Clock clock;

    @Before
    public void startClock() {
        clock = new Clock();
        clock.reset();
    }

    @Test
    public void correctTimeShouldReturnTime() {
        assertEquals("Correct, should return time", "15:15:15", clock.set(15, 15, 15));
    }

    @Test
    public void hourToSmallShouldReturnNull() {
        assertEquals("Hour too small, return null", null, clock.set(-10, 15, 15));
    }

    @Test
    public void hourTooLargeShouldReturnNull() {
        assertEquals("Hour too large, return null", null, clock.set(30, 15, 15));
    }

    @Test
    public void minuteTooSmallShouldReturnNull() {
        assertEquals("minute too small, return null", null, clock.set(15, -10, 15));
    }

    @Test
    public void minuteTooLargeShouldReturnNull() {
        assertEquals("minute too large, return null", null, clock.set(15, 100, 15));
    }

    @Test
    public void secondTooSmallShouldReturnNull() {
        assertEquals("second too small, return null", null, clock.set(15, 15, -10));
    }

    @Test
    public void secondTooLargeShouldReturnNull() {
        assertEquals("second too large, return null", null, clock.set(15, 15, 100));
    }

    @After
    public void end() {
        clock = null;
    }
}

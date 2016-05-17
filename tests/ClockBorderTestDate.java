/**
 * Created by gustavbodestad on 2016-05-13.
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
public class ClockBorderTestDate {
    private Clock clock;

    @Before
    public void startClock() {
        clock = new Clock();
        clock.changeMode();
        clock.reset();
    }

    @Test
    public void correctDateShouldReturnDate() {
        assertEquals("Correct, should return date", "2009/4/9", clock.set(2009, 4, 9));
    }

    @Test
    public void yearToSmallShouldReturnNull() {
        assertEquals("Year too small, return null", null, clock.set(1910, 4, 9));
    }

    @Test
    public void yearTooLargeShouldReturnNull() {
        assertEquals("Year too large, return null", null, clock.set(2200, 4, 9));
    }

    @Test
    public void monthTooSmallShouldReturnNull() {
        assertEquals("Month too small, return null", null, clock.set(2009, -4, 9));
    }

    @Test
    public void monthTooLargeShouldReturnNull() {
        assertEquals("Month too large, return null", null, clock.set(2009, 15, 9));
    }

    @Test
    public void dayTooSmallShouldReturnNull() {
        assertEquals("Day too small, return null", null, clock.set(2009, 4, -10));
    }

    @Test
    public void dayTooLargeShouldReturnNull() {
        assertEquals("Day too large, return null", null, clock.set(2009, 4, 50));
    }

    @After
    public void end() {
        clock = null;
    }
}

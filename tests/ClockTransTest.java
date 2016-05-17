/**
 * Created by gustavbodestad on 2016-05-13.
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class ClockTransTest {
    Clock clock;

    @Before
    public void startClock() {
        clock = new Clock();
    }

    @Test
    public void setDuringS1ShouldDoNothing() {
        assertEquals("Set during S1 does nothing", null, clock.set(15, 15, 15));
    }

    @Test
    public void resetDuringS1ShouldChangeToS3() {
        assertEquals("S1 to S3", "Alter Time", clock.reset());
    }

    @Test
    public void changeModeDuringS3ShouldDoNothing() {
        clock.reset();
        assertEquals("ChangeMode during S3 does nothing", null, clock.changeMode());
    }

    @Test
    public void resetDuringS3ShouldDoNothing() {
        clock.reset();
        assertEquals("Rest during S3 does nothing", null, clock.reset());
    }

    @Test
    public void setDuringS3ShouldReturnTime() {
        clock.reset();
        assertEquals("Set during S3 returns Time", "14:15:16", clock.set(14, 15, 16));
    }

    @Test
    public void changeModeDuringS1ShouldSwithToS2() {
        assertEquals("S1 to S2", "2000/1/1", clock.changeMode());
    }

    @Test
    public void setDuringS2ShouldDoNothing() {
        clock.changeMode();
        assertEquals("Set during S2 does nothing", null, clock.set(2010, 11, 3));
    }

    @Test
    public void resetDuringS2ShouldChangeToS4() {
        clock.changeMode();
        assertEquals("S2 to S4", "Alter Date", clock.reset());
    }

    @Test
    public void resetDuringS4ShouldDoNothing() {
        clock.changeMode();
        clock.reset();
        assertEquals("Reset during S4 does nothing", null, clock.reset());
    }

    @Test
    public void changeModeDuringS4ShouldDoNothing() {
        clock.changeMode();
        clock.reset();
        assertEquals("ChangeMode during S4 does nothing", null, clock.changeMode());
    }

    @Test
    public void setDuringS4ShouldReturnDate() {
        clock.changeMode();
        clock.reset();
        assertEquals("Set during S4 returns date", "2000/10/8", clock.set(2000, 10, 8));
    }

    @Test
    public void changeModeDuringS2ShouldSwithToS1() {
        clock.reset();
        clock.set(15, 15, 15);
        clock.changeMode();
        assertEquals("S2 to S1", "15:15:15", clock.changeMode());
    }

    @After
    public void end() {
        clock = null;
    }


}

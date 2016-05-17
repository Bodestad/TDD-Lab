/**
 * Created by gustavbodestad on 2016-05-13.
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RovarTest {

    @Test
    public void enrovShouldWorkWithUppercaseLetters() {
        assertEquals("enrov UC", "ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMNONOPOPQOQRORSOSTOTUVOVXOXYZOZ",
                rovar.enrov("ABCDEFGHIJKLMNOPQRSTUVXYZ"));
    }

    @Test
    public void enrovShouldWorkWithLowercaseLetters() {
        assertEquals("enrov LC", "abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovxoxyzoz",
                rovar.enrov("abcdefghijklmnopqrstuvxyz"));
    }

    @Test
    public void enrovShouldWorkWithNumbers() {
        assertEquals("enrov NBR", "1234567890",
                rovar.enrov("1234567890"));
    }

    @Test
    public void enrovShouldWorkWithEmptyString() {
        assertEquals("enrov ES", "",
                rovar.enrov(""));
    }

    @Test
    public void derovShouldWorkWithUppercaseLetters() {
        assertEquals("derov UC", "ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMNONOPOPQOQRORSOSTOTUVOVXOXYZOZ",
                rovar.enrov("ABCDEFGHIJKLMNOPQRSTUVXYZ"));
    }

    @Test
    public void derovShouldWorkWithLowercaseLetters() {
        assertEquals("derov LC", "abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovxoxyzoz",
                rovar.enrov("abcdefghijklmnopqrstuvxyz"));
    }

    @Test
    public void derovShouldWorkWithNumbers() {
        assertEquals("derov NBR", "1234567890",
                rovar.enrov("1234567890"));
    }

    @Test
    public void derovShouldWorkWithEmptyString() {
        assertEquals("derov ES", "",
                rovar.enrov(""));
    }

}
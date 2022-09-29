import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class leapYearTest {
    @Test
    public void Test01 ()
    {
        leapYear leap = new leapYear();
        assertEquals(leap.myLeapyear(), true);

    }
    @Test
    public void Test02()
    {
        leapYear leap = new leapYear();
        assertEquals(leap.myLeapyear(), true);

    }
}



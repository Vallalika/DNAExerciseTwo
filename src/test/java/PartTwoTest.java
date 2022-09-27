import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartTwoTest {
    private PartTwo partTwo;

    @Before
    public void before() {
        partTwo = new PartTwo();
    }

    @Test
    public void canFindHowMany() {
        String dnaStrandOne = "GAATAACAAAAA";
        String dnaStrandTwo = "ATGAACGAATTGAATC";
        String dnaStrandThree = "GAAGATAAGACAGAAATG";
        String dnaStrandFour = "GAAGATAAGACAGAAATC";
        assertEquals(4, PartTwo.howMany("AA",dnaStrandOne));
        assertEquals(3, PartTwo.howMany("GAA",dnaStrandTwo));
        assertEquals(1, PartTwo.howMany("ATG", dnaStrandThree));
        assertEquals(0, PartTwo.howMany("ATG", dnaStrandFour));
    }
}
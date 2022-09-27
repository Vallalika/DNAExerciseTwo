import org.junit.Before;
import org.junit.Test;

public class PartTwoTest {
    private PartTwo partTwo;

    @Before
    public void before() {
        partTwo = new PartTwo();
    }

    @Test
    public void canFindHowMany() {
        String dnaStrandOne = "GAATAACAAAAA";
        String dnaStrandTwo = "GAAGATAAGACAGAAAAA";
        String dnaStrandThree = "GAAGATAAGACAGAAATG";
        assertEquals(4, PartTwo.howMany("aa",dnaStrandOne));
        assertEquals(1, PartTwo.howMany("gaa",dnaStrandTwo));
        assertEquals(1, PartTwo.howMany("atg", dnaStrandThree));
    }
}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartOneTest {

    PartOne partOne;
    String dna;
    int startIndex;
    String stopCodonOne;
    String stopCodonTwo;
    String stopCodonThree;

    @Before
    public void before() {
        partOne = new PartOne();
        //     ATG     TGA TAG   TAAATG
        dna = "ATGATCGCTGATTAGGCTTAAATGACG";
        startIndex = 0;
        stopCodonOne = "TGA";
        stopCodonTwo = "TAA";
        stopCodonThree = "TAG";

    }

    @Test
    public void canFindStopCodon(){
        assertEquals(11,partOne.findStopCodon(dna, startIndex, stopCodonOne));
        assertEquals(18,partOne.findStopCodon(dna, startIndex, stopCodonTwo));
        assertEquals(12,partOne.findStopCodon(dna, startIndex, stopCodonThree));
    }
}

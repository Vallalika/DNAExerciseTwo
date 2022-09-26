import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartOneTest {

    PartOne partOne;
    String dna;
    int startIndex;
    String stopCodon;

    @Before
    public void before() {
        partOne = new PartOne();
        startIndex = 0;
        stopCodon = "TGA";

    }

    @Test
    public void canFindStopCodon(){
        //            ATG     TGA     TGA  TGA
        String dna = "ATGATCGCTGATTAGGTGACGTGATGACG";
        assertEquals(21,partOne.findStopCodon(dna, startIndex, stopCodon));
    }

    @Test
    public void noStopCodon() {
        String dna = "ATGATCGCTGGTTAGGCTTATATACCG";
        assertEquals(dna.length(),partOne.findStopCodon(dna, startIndex, stopCodon));
    }

    @Test
    public void canFindValidGene() {
        String dna = "ATGATCGCTGATTATGTGACGTGATAAGACG";
        assertEquals("ATGATCGCTGATTATGTGACGTGATAA", partOne.findGene(dna));

    }

    @Test
    public void noValidGene() {
        String dna = "ATGATCGCTGATTATGTGACGTGATATGCCG";
        assertEquals("", partOne.findGene(dna));

    }
}

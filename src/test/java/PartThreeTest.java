import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartThreeTest {

    private PartThree partThree;

    @Before
    public void before() {
        partThree = new PartThree();
    }

    @Test
    public void testCountGene() {
        String dnaStrandOne = "ATGGAAGATTAAGATGCAGAAATGTTAGATG";
        String dnaStrandTwo = "GATGAAGATAGCTAAGATGCAGAAATGTTAGATG";
        assertEquals(2,partThree.countGenes(dnaStrandOne));
        assertEquals(1,partThree.countGenes(dnaStrandTwo));
    }

    @Test
    public void testCountGeneWhereNoValidGene() {
        String dnaStrand = "ATGGAAGATTATAGATGCAGAAATGTTTAGATG";
        assertEquals(0,partThree.countGenes(dnaStrand));
    }
}

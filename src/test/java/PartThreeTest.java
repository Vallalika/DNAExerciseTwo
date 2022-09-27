import org.junit.Before;
import org.junit.Test;

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
        assertEquals(2,partThree.countGene(dnaStrandOne));
        assertEquals(1,partThree.countGene(dnaStrandOne));
    }

    @Test
    public void testCountGeneWhereNoValidGene() {
        String dnaStrand = "ATGGAAGATTATAGATGCAGAAATGTTTAGATG";
        assertEquals(0,partThree.countGene(dnaStrandOne));
    }
}

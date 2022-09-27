public class PartOne {

    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currIndex = dna.indexOf(stopCodon,startIndex+3);
        while ( currIndex != -1 ) {
            if ( (currIndex - startIndex) % 3 == 0) {
                return currIndex;
            }
            currIndex = dna.indexOf(stopCodon,currIndex+1);
        }
        return dna.length();
    }

    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG", 0);
        int tagCodon = findStopCodon(dna, startIndex,"TAG");
        int taaCodon = findStopCodon(dna, startIndex, "TAA");
        int tgaCodon = findStopCodon(dna, startIndex, "TGA");
        int temp = Math.min(tagCodon,taaCodon);
        int minIndex = Math.min(temp, tgaCodon);
        if (minIndex < dna.length()) {
            return dna.substring(startIndex, minIndex + 3);
        }
        return "";
    }

    public void printAllGenes(String dna) {
        String dnaStrand = dna;
        while (true) {
            String gene = findGene(dnaStrand);
            if (gene.length() != 0) {
                System.out.println(gene);
                dnaStrand = dnaStrand.substring(gene.length());
            } else {
                break;
            }
        }
    }
}
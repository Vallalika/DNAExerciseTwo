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
        int atgCodon = findStopCodon(dna, startIndex, "ATG");
        int stopCodon = 0;

        if (tagCodon < taaCodon) {
            stopCodon = tagCodon;
        } else {
            stopCodon = taaCodon;
        }
        if (stopCodon > atgCodon) {
            stopCodon = atgCodon;
        }
        if (stopCodon < dna.length()) {
            return dna.substring(startIndex,stopCodon + 3);
        }
        return "";
    }
}
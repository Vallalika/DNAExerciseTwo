public class PartOne {
    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int stopIndex = dna.indexOf(stopCodon,startIndex+3);
        String dnaString = dna.substring(startIndex, stopIndex + 3);
        if ( dnaString.length() % 3 == 0) {
            return stopIndex;
        } else {
            return dnaString.length();
        }
    }
}

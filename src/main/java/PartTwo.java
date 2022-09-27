public class PartTwo {

    public static int howMany(String stringa, String stringb) {
        int count = 0;
        int startIndex = 0;
        while (true) {
            int found = stringb.indexOf(stringa, startIndex);
            if (found != -1) {
                count +=1;
                startIndex = found + stringa.length();
            } else {
                break;
            }
        }
        return count;
    }
}
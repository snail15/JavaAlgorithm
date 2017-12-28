package CarckingCoding;

/**
 * Created by sunginjung on 12/28/17.
 */
public class numbersNeededAnagram {
    public static void main(String[] args) {

    }

    public static int numberNeeded(String first, String second) {

        int[] charCount = new int[256];

        for(char c : first.toCharArray()) {
            charCount[c]++;
        }

        for(char c: second.toCharArray()) {
            charCount[c]--;
        }

        int result = 0;
        for(int i : charCount) {
            result += Math.abs(i);
        }

        return result;
    }
}

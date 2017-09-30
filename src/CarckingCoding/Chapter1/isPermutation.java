package CarckingCoding.Chapter1;

/**
 * Created by sunginjung on 9/29/17.
 */
public class isPermutation {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "abcfed";
        String s3 = "asdasa";

        System.out.println(isPermutation(s1, s2));
        System.out.println(isPermutation(s1, s3));

    }

    static boolean isPermutation(String s1, String s2) {

        if(s1.length() != s2.length()){
            return false;
        }

        int[] char_set = new int[128];
        char[] s1_char = s1.toCharArray();
        for(char c : s1_char){
            char_set[c]++;
        }

        for(int i = 0; i < s2.length(); i++){
            int c = s2.charAt(i);
            char_set[c]--;
            if(char_set[c] < 0){
                return false;
            }
        }

        return true;

    }
}

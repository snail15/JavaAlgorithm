package CarckingCoding;

/**
 * Created by sunginjung on 9/29/17.
 */
public class oneAway {
    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "ple"));
        System.out.println(isOneAway("pales", "pale"));
        System.out.println(isOneAway("pale", "bale"));
        System.out.println(isOneAway("pale", "bae"));
        System.out.println(isOneAway("pale", "baeaa"));
        System.out.println(isOneAway("pale", "paleaa"));
    }

    static boolean isOneAway(String s1, String s2){

        if(Math.abs(s1.length() - s2.length()) > 1){
            return false;
        }

        int[] char_count = new int[128];

        char[] s1_char = s1.toCharArray();

        for(char c : s1_char){
            char_count[c]++;
        }

        for(int i = 0; i < s2.length(); i++){
            int idx = s2.charAt(i);
            char_count[idx]--;
        }

        int one_count = 0;
        for(int value: char_count){
            if(one_count > 1) {
                return false;
            }
            if( value == 1){
                one_count++;
            }
        }

        return true;


    }
}

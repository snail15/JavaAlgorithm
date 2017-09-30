package CarckingCoding.Chapter1;

/**
 * Created by sunginjung on 9/29/17.
 */
public class isPaliPermu {
    public static void main(String[] args) {
        String test = "TACT Coa";
        String test2 = "T  act coA";
        String test3 = "Aloha";

        System.out.println(isPaliPermu(test));
        System.out.println(isPaliPermu(test2));
        System.out.println(isPaliPermu(test3));
    }

    static boolean isPaliPermu(String s){
        s = s.toLowerCase().trim().replace(" ","");
        int[] char_set = new int[128];

        for(int i = 0; i<s.length(); i++) {
            int idx = s.charAt(i);
            char_set[idx]++;
        }

        if(s.length() % 2 == 0){
            for(int count : char_set){
                if(count % 2 != 0){
                    return false;
                }
            }
        } else {
            int odd_count = 0;
            for(int count: char_set){
                if(count % 2 != 0) {
                    odd_count++;
                }
                if(odd_count > 1){
                    return false;
                }
            }
        }
        return true;
    }
}

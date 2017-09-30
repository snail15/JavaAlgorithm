package CarckingCoding.Chapter1;

/**
 * Created by sunginjung on 9/29/17.
 */
public class isUnique {
    public static void main(String[] args) {

        String test = "abscdegadkdfs;qjgnslkLJFMSD.,FMD';Aasd";
        String test2 = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(isUnique(test));
        System.out.println(isUnique(test2));

    }

    static boolean isUnique(String s){

        if(s.length() > 128) {
            return false;
        }

        boolean[] chars = new boolean[128];


        for(int i = 0; i < s.length(); i++){

            int value = s.charAt(i);

            if(chars[value] == true) {
                return false;
            } else {
                chars[value] = true;
            }
        }

        return true;


    }
}

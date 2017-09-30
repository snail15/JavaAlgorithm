package CarckingCoding.Chapter1;

/**
 * Created by sunginjung on 9/30/17.
 */
public class stringCompression {

    public static void main(String[] args) {
        System.out.println(stringCompression("aaabaacccce"));
    }

    static String stringCompression(String s){

        StringBuilder builder = new StringBuilder();

        int repeat = 1;
        char last_char = s.charAt(0);

        for(int i = 1; i < s.length(); i++){
            if(last_char == s.charAt(i)){
                repeat++;
            } else {
                builder.append(last_char);
                builder.append(repeat);
                last_char = s.charAt(i);
                repeat = 1;
            }
        }

        builder.append(last_char);
        builder.append(repeat);

        return builder.toString();

    }
}

package LeetCode;

/**
 * Created by sunginjung on 10/3/17.
 */
public class reverseStringinSentence {

    public static void main(String[] args) {

        System.out.println(reverseString("Hi I am Sungin"));
    }

    static String reverseString(String s){

        StringBuilder builder = new StringBuilder();

        int marker = s.length() - 1;

        for(int i = s.length() - 1; i >= 0; i--){

            if(s.charAt(i) == ' '){

                builder.append(s.substring(i + 1, marker + 1));
                builder.append(" ");
                marker = i-1;
            }
        }

        int idx = 0;
        while(s.charAt(idx) != ' '){
            idx++;
        }

        builder.append(s.substring(0, idx));

        System.out.println(builder.toString().length());

        return builder.toString();
    }
}

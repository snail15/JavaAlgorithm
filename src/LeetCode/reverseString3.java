package LeetCode;

/**
 * Created by sunginjung on 1/5/18.
 */

//Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//        Example 1:
//        Input: "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"

public class reverseString3 {

    public static String reverseWords(String s) {
        String[] original = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < original.length; i++) {
            for(int j = original[i].length() - 1; j >= 0; j-- ) {
                sb.append(original[i].charAt(j));

            }
            if(i < original.length -1) sb.append(" ");
        }
        return sb.toString();
    }

}

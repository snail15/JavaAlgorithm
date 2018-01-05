package LeetCode;

/**
 * Created by sunginjung on 1/5/18.
 */
public class reverseInteger {

    public static int reverse(int x) {
        boolean negative = false;
        if(x == 0 ) return x;
        if(x < 0){
            negative = true;
            x *= -1;
        }

        StringBuilder sb = new StringBuilder();

        while(x > 0) {
            int digit = x % 10;
            if(digit != 0 || sb.length() != 0){
                sb.append(String.valueOf(digit));
            }
            x /= 10;
        }

        try{
            int result = Integer.parseInt(sb.toString());
            if(negative) result *= -1;
            return result;
        } catch(NumberFormatException e){
            return 0;
        }
    }
}

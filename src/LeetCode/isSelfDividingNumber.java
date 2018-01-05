package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunginjung on 1/5/18.
 */
public class isSelfDividingNumber {

    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<Integer>();

        for(int i=left; i<=right ; i++){
            if(isSelfDividingNumber(i))
                ans.add(i);
        }
        return ans;
    }


    public static boolean isSelfDividingNumber(int n){
        int original = n;
        while(n>0){
            int digit = n;
            if(digit == 0)            return false;
            if(original % digit !=0)   return false;
            n /= 10;
        }
        return true;
    }
}

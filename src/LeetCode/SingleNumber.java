package LeetCode;

/**
 * Created by sunginjung on 1/4/18.
 */

//Given an array of integers, every element appears twice except for one. Find that single one.

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        int len = nums.length;
        int answer = 0;

        for(int i = 0; i < len; i++){
            answer ^= nums[i];
        }

        return answer;
    }
}

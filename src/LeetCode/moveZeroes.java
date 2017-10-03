package LeetCode;

/**
 * Created by sunginjung on 10/2/17.
 */
public class moveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        int zero = 0;
        for(int i = 0; i <nums.length;  i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = temp;
                zero++;
            }
        }
        for(int val : nums){
            System.out.println(val);
        }
    }

}

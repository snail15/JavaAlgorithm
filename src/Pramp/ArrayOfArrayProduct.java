package Pramp;

/**
 * Created by sunginjung on 1/6/18.
 */
//
//#Array of Array Products
//
//        Given an array of integers arr, write a function that returns another array at the same length where the value at each index i is the product of all array values except arr[i].
//
//        Solve without using division and analyze the runtime and space complexity
//
//        Example: given the array [2,  7,  3,  4]
//        your function would return: [84, 24, 56, 42]
//        (by calculating: [7*3*4, 2*3*4, 2*7*4, 2*7*3])
public class ArrayOfArrayProduct {

    public static void main(String[] args) {
        int[] test = new int[] {2,7,3,4};
        int[] result = productOfProduct(test);

        for(int i : result) {
            System.out.println(i);
        }
    }

    private static int[] productOfProduct(int[] nums) {

        int len = nums.length;
        int [] output = new int[len];

        int leftMult = 1, rightMult = 1;

        for(int i = len-1; i >= 0; i--){
            output[i] = rightMult;
            rightMult *= nums[i];
        }
        for(int j = 0; j < len; j++){
            output[j] *= leftMult;
            leftMult *= nums[j];

        }

        return output;
    }

}

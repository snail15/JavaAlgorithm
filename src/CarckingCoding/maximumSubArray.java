package CarckingCoding;

/**
 * Created by sunginjung on 10/1/17.
 */
public class maximumSubArray {

    public static void main(String[] args) {

        int[] test = new int[] { -1, -3, -4, -5, -6};
        int[] test2 = new int[] { 0, 1, 2, 3, 4};
        int[] test3 = new int[] { 100, 1, -99, -5, 40};
        int[] test4 = new int[] { 0, 1, -20, 30, -2};

        int[] result = maximumSubArray(test);
        int[] result2 = maximumSubArray(test2);
        int[] result3 = maximumSubArray(test3);
        int[] result4 = maximumSubArray(test4);

        for(int value : result4){
            System.out.println(value);
        }

    }

    static int[] maximumSubArray(int[] arr) {
        if (arr.length == 0) {
            throw new IndexOutOfBoundsException("Array Empty");
        }

        int maxSum = arr[0];
        int currentSum = arr[0];
        int marker = 0;
        int startIndex = 0;
        int endIndex = 0;
        int[] resultArray = new int[3];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > (currentSum + arr[i])) {
                currentSum = arr[i];
                marker = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = marker;
                endIndex = i;
            }
        }
        resultArray[0] = maxSum;
        resultArray[1] = startIndex;
        resultArray[2] = endIndex;

        return resultArray;
    }
}
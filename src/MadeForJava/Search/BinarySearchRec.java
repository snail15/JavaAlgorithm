package MadeForJava.Search;

/**
 * Created by sunginjung on 12/29/17.
 */
public class BinarySearchRec {

    public static void main(String[] args) {

        int[] test = new int[]{1,2,3,4,5};

        System.out.println(binarySearchRec(test, 0, test.length - 1, 8));

    }


    private static int binarySearchRec(int[] arr, int low, int high, int value) {

        if(low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if(arr[mid] == value) {
            return mid;
        }else if (value > arr[mid]) {
            return binarySearchRec(arr, mid + 1, high, value);
        }else {
            return binarySearchRec(arr, low, mid - 1, value);
        }


    }
}

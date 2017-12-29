package MadeForJava.Search;

/**
 * Created by sunginjung on 12/29/17.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5};

        System.out.println(binarySearch(test, 0));
    }


    private static int binarySearch(int[] arr, int value) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == value) {
                return mid;
            } else if(value > arr[mid]) {
                low = mid + 1;
            } else if(value < arr[mid]) {
                high = mid - 1;
            }
        }

        return -1;
    }
}

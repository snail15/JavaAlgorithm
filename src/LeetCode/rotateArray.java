package LeetCode;

/**
 * Created by sunginjung on 10/2/17.
 */
public class rotateArray {
    public static void main(String[] args) {

        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7};

        rorateArray(test, 3);

        for(int value: test){
            System.out.print(value + " ");
        }


    }

    public static int[] reverseArray(int[] arr, int p, int q){

        while(p < q){
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }

        return arr;
    }

    public static void rorateArray(int[] arr, int n){

        int len = arr.length;

        n *= -1;
        n = n % len;
        n = n + len;

        arr = reverseArray(arr, 0, len - 1);
        arr = reverseArray(arr, 0, n - 1);
        arr = reverseArray(arr, n , len - 1);
    }
}

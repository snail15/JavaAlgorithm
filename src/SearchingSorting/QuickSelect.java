package SearchingSorting;

import java.util.Random;

/**
 * Created by sunginjung on 10/2/17.
 */
public class QuickSelect {

    public static void main(String[] args) {

        int[] test = new int[]{0,10,3,4,5,100,99};
        int mid = (test.length - 1) / 2;

        System.out.println(quickSelect(test, 0, test.length - 1, mid));

    }



    static int quickSelect(int[] arr, int start, int end, int k){
        if(start == end){
            return arr[start];
        }

        int pivotIdx = randomPartition(arr, start, end);
        if(pivotIdx == k){
            return arr[pivotIdx];
        } else if(k < pivotIdx){
            return quickSelect(arr, start, pivotIdx - 1, k);
        } else {
            return quickSelect(arr, pivotIdx + 1,  end, k);
        }

    }

    private static int randomPartition(int[] arr, int start, int end) {
        Random random = new Random();
        int randomIndex = random.nextInt(end + 1);
        int pivot = arr[randomIndex];

        int swapTemp = arr[randomIndex];
        arr[randomIndex] = arr[end];
        arr[end] = swapTemp;

        int i = start - 1;
        for(int j = start; j < end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[end] = temp;

        return i + 1;

    }
}

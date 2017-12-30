package MadeForJava.Sorting;

/**
 * Created by sunginjung on 12/30/17.
 */
public class quickSort {

    public static void main(String[] args) {

        int[] test = new int[] {2,3,11,5,0,-1,20,-5};

        quickSort(test, 0 , test.length - 1);

        for(int value : test) {
            System.out.print(value + " ");
        }

    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end );
        }


    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j < end; j++) {
            if(arr[j] <= pivot) {
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

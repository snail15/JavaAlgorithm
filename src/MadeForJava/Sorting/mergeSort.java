package MadeForJava.Sorting;

/**
 * Created by sunginjung on 12/30/17.
 */
public class mergeSort {

    public static void main(String[] args) {

        int[] test = new int[] {2,3,11,5,0,-1,20,-5};

        mergeSort(test, 0, test.length - 1);

        for(int value : test) {
            System.out.print(value + " ");
        }

    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(end <= start) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {

        int leftIdx = start;
        int rightIdx = mid + 1;
        int idx = 0;
        int[] tempArray = new int[end - start + 1];

        while(leftIdx <= mid && rightIdx <= end) {
            if(arr[leftIdx] <= arr[rightIdx]) {
                tempArray[idx] = arr[leftIdx];
                leftIdx++;
            } else {
                tempArray[idx] = arr[rightIdx];
                rightIdx++;
            }
            idx++;
        }

        if(leftIdx <= mid) {
            while(leftIdx <= mid) {
                tempArray[idx] = arr[leftIdx];
                leftIdx++;
                idx++;
            }
        }else if(rightIdx <= end) {
            while(rightIdx <= end) {
                tempArray[idx] = arr[rightIdx];
                rightIdx++;
                idx++;
            }
        }

        for(int i = 0; i < tempArray.length; i++) {
            arr[start + i] = tempArray[i];
        }
    }


}

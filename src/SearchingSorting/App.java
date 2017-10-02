package SearchingSorting;

import java.util.Arrays;

/**
 * Created by sunginjung on 9/30/17.
 */
public class App {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = new int[] {12,4,11,135,135,1,0,100,99};
        int[] arr3 = new int[] {12,4,11,135,135,1,0,100,99};
        int[] arr4 = new int[] {12,4,11,135,135,1,0,100,99};
        int[] arr5 = new int[] {12,4,11,135,135,1,0,100,99};


//        System.out.println(binarySearch(arr, 2));
//        System.out.println(binarySearch(arr, 7));
//        System.out.println(binarySearch(arr, 6));
//        System.out.println(binarySearch(arr, 8));
//        System.out.println(binarySearch(arr, 1));
//
//        System.out.println(rec_BinarySearch(arr, 2));
//        System.out.println(rec_BinarySearch(arr, 7));
//        System.out.println(rec_BinarySearch(arr, 6));
//        System.out.println(rec_BinarySearch(arr, 8));
//        System.out.println(rec_BinarySearch(arr, 1));
//
//        arr2 = selectionSort(arr2);
//
//        for(int value : arr2){
//            System.out.println(value);
//        }
//
//        arr3 = selectionSort2(arr3);
//
//        for(int value: arr3){
//            System.out.println(value);
//        }
//
//        arr4 = inserstionSort(arr4);
//
//        for(int value: arr4){
//            System.out.println(value);
//        }

          quickSort(arr5, 0, arr5.length - 1);
          for(int value: arr5){
              System.out.println(value);
          }

    }

    static int binarySearch(int[] arr, int x){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = (start + end) / 2;

            if(arr[mid] == x){
                return mid;
            }else if(x < arr[mid]){
                end = mid - 1;
            }else if(x > arr[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int rec_BinarySearch(int[] arr, int x){
        return recursiveBinarySearch(arr, 0, arr.length - 1, x);
    }

    static int recursiveBinarySearch(int[] arr, int start, int end, int x){

        if(start > end){
            return -1;
        }

        int mid = (start + end) / 2;

        if(arr[mid] == x){
            return mid;
        }else if(x > arr[mid]){
            return recursiveBinarySearch(arr, mid + 1, end, x);
        }else {
            return recursiveBinarySearch(arr, start, mid - 1, x);
        }
    }

    static int[] selectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int minMarker = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minMarker]){
                    minMarker = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minMarker];
            arr[minMarker] = temp;
        }
        return arr;
    }

    static int[] selectionSort2(int[] arr){
        for(int i = arr.length - 1; i > 0; i--){
            int maxMarker = i;
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[maxMarker]){
                    maxMarker = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxMarker];
            arr[maxMarker] = temp;
        }

        return arr;
    }

    static int[] inserstionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        return arr;
    }

    static void mergeSort(int[] arr, int start, int end){
        if(end <= start){
            return;
        }

        int mid = (start + end ) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {

        int[] tempArray = new int[ end - start + 1];

        int leftidx = start;
        int rightidx = mid + 1;
        int idx = 0;

        while(leftidx <= mid && rightidx <= end) {
            if(arr[leftidx] < arr[rightidx]){
                tempArray[idx] = arr[leftidx];
                leftidx++;
            } else {
                tempArray[idx] = arr[rightidx];
                rightidx++;
            }
            idx++;
        }

        if(leftidx <= mid){
            while(leftidx <= mid){
                tempArray[idx] = arr[leftidx];
                leftidx++;
                idx++;
            }
        }else if(rightidx <= end){
            while(rightidx <= end){
                tempArray[idx] = arr[rightidx];
                rightidx++;
                idx++;
            }
        }


        for(int i = 0; i < tempArray.length; i++){
            arr[start + i] = tempArray[i];
        }

    }

    static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pivotIdx = partition(arr, start, end);
            quickSort(arr, start, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1,  end);

        }
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
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

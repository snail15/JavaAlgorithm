package MadeForJava.Sorting;

/**
 * Created by sunginjung on 12/30/17.
 */
public class selectionSort {

    public static void main(String[] args) {
        int[] test = new int[] {2,3,11,5,0,-1,20,-5};

        test = selectionSort(test);

        for(int value : test) {
            System.out.print(value + " ");
        }
    }

    private static int[] selectionSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int minMarker = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minMarker]) {
                    minMarker = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minMarker];
            arr[minMarker] = temp;
        }

        return arr;
    }
}

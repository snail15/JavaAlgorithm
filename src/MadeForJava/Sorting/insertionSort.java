package MadeForJava.Sorting;

/**
 * Created by sunginjung on 12/30/17.
 */
public class insertionSort {

    public static void main(String[] args) {

        int[] test = new int[] {2,3,11,5,0,-1,20,-5};

        test = insertionSort(test);

        for(int value : test) {
            System.out.print(value + " ");
        }

    }

    private static int[] insertionSort(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }

        return arr;
    }

}

package DSA.Lecture_11;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = { 1, 3, 5, 4, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[]arr){
        boolean swapped; 
        /*Declares a flag variable swapped.
        Used to check if any swapping happened in a pass.
        Optimization → if no swap happened, array is already sorted → stop early. */

        for(int i = 0; i < arr.length; i++){
            swapped =false;
            /*At the start of each pass, reset swapped to false.
            If we swap elements in this pass → set to true.
            If it stays false → break the loop early (array sorted). */

            for(int j = 1; j < arr.length - i; j++){

                if(arr[j] < arr[j-1]){

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                    /*Marks that a swap has happened in this pass.
                    Means the array was not fully sorted yet. */
                }
            }
            if(!swapped){
                break;
                /*After finishing the inner loop, check if any swap occurred.
                If not → array is already sorted → break out early (optimization).
                Saves time instead of continuing unnecessary passes. */
            }
        }
    }
}

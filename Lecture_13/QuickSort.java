package DSA.Lecture_13;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr ={5, 4, 3, 2, 1};
        System.out.println("Before Quick Sort: " + Arrays.toString(arr));
        quick(arr, 0, arr.length - 1);
        // Arrays.sort(arr);
        System.out.println("After Quick Sort: " + Arrays.toString(arr));
    }
    static void quick(int[]arr, int low, int high){
        if (low >= high){
            return;
            // ✅ Stops recursion when the subarray has 0 or 1 elements.
            // ✅ Only runs partitioning if there are 2 or more elements (low < high).
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) { //The left kid keeps walking right as long as they see numbers smaller than the pivot
                start++;
            }
            while (arr[end] > pivot) {  //The right kid keeps walking left as long as they see numbers bigger than the pivot.”
                end--;
            }
            if (start <= end){

                /*“Now check: are both kids still facing each other or standing at the same spot?”
                If true (start <= end) →
                Swap the two numbers they’re pointing at.
                This fixes the misplacement: the too-big number goes right, the too-small number goes left.
                Then both kids move one step inward (start++ and end--). */

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++; //Because after swapping, the number now at start belongs on the left side (it’s small enough). No need to check it again.
                end--; //Similarly, after swapping, the number now at end belongs on the right side (it’s big enough). No need to check it again.
            }
        }
        //now my pivot is at corect index, please solve two halves now
        quick(arr, low, end);
        quick(arr, start, high);

        /*At this point in the code

        After the partition loop, we’ve rearranged elements around the pivot such that:
        Everything up to end is ≤ pivot (or at least "not greater than pivot").
        Everything from start onward is ≥ pivot.

        And importantly:
        👉 end < start when the loop exits.
        That’s our partition boundary. */

    }
}

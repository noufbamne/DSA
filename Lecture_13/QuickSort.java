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
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        //now my pivot is at corect index, please solve two halves now
        quick(arr, low, end);
        quick(arr, start, high);

    }
}

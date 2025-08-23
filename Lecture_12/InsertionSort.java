package DSA.Lecture_12;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5, 3, 4, 1, 2};
        System.out.println("Before Sort: " + Arrays.toString(arr));
        insertion(arr);
        System.out.println("After Insertion Sort: " + Arrays.toString(arr));
    }

    static void insertion(int[]arr){

        for (int i = 0; i < arr.length - 1; i++){ // arr.length - 1 == i< n-2, can also write i <= arr.length -2
            for (int j= i+1; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}

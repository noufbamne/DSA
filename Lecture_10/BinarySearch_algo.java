package DSA.Lecture_10;

public class BinarySearch_algo {
    public static void main(String[] args) {
        int [] arr ={2, 3, 4, 5, 7, 9, 22};
        int ans = binarysearch(arr, 5);
        System.out.println(ans);
    }
    // return index
    // return -1 if not exist
    static int binarysearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // find the middle element
            // int mid = (start + end) / 2;
            // int has fixed size
            // migt be possible that (start+end) exceeds the range of int in java
            int mid = start + (end -start) / 2;
            
            if (target < arr[mid]){
                end = mid -1; 
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

package DSA.Lecture_10;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
       int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
       int ans = orderagnostic(arr, 7);
       System.out.println(ans); 
    }
    static int orderagnostic(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            int mid = start + (end - start) /2;

            if (target < arr[mid]){
                start = mid +1;
            }
            else if (target > arr[mid]){
                end = mid -1;
            }
            else{
                // ans found
                return mid;
            }
        }
        return -1;
    }
}

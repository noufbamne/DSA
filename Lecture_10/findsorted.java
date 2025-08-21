package DSA.Lecture_10;

public class findsorted {
    public static void main(String[] args) {
        // int [] arr = {2, 3, 4, 5, 7, 9, 22};
        int [] arr = {22, 3, 2, 1};
        int target = 22;
        int ans = find(arr, target);
        System.out.println(ans);
    }
    static int find(int[]arr, int target){

        int start = 0;
        int end = arr.length -1;

        // find whether the array is descending or ascending

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) /2;

            if (target == arr[mid]){
                return mid;
            }

            if(isAsc){

                if (target < arr[mid]){
                    end = mid -1;
                }
                else if (target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid -1;
                }
                else if(target < arr[mid]){
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}

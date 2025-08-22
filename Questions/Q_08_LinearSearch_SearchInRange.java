package DSA.Questions;

public class Q_08_LinearSearch_SearchInRange {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 5,-6, 7, 8, 9}; //declaring array
        int target = 3;                            // declaring element we want to search for
        int ans = linearsearch(nums, target, 1, 4);      // storing our ans
        System.out.println(ans);                   // printing ans
        
    }

    static int linearsearch(int [] arr, int target, int start, int end){

        if(arr.length == 0){
            return -1;                         // statement if array is empty
        }

        for(int index = start; index <= end; index++){ // including end
            int element = arr[index];          // checking element for every index in array
            if (element == target){
                return index;                   // if found returning its index
            } 
        }
        return -1;                               // else returning not found
        
    }
}


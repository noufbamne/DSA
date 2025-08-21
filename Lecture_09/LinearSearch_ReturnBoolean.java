package DSA.Lecture_09;

public class LinearSearch_ReturnBoolean {
    public static void main(String[] args) {
        
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        boolean ans = linearsearch(nums, target); 
        System.out.println(ans);
    }
    // Search the array and return true or false
    static boolean linearsearch(int [] arr, int target){

        if(arr.length == 0){
            return false;
        }
        
        for(int index = 0; index < arr.length; index++){

            int element = arr[index];
            if (element == target){
                return true;
            }
        /* Either way
         
        for(element : arr){
            if(element == target){
            return element;
            }
        }
        */
        }
        return false;
    }
}

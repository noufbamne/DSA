package DSA.Lecture_09;

public class LinearSearch_ReturnElement {
    public static void main(String[] args) {
        
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        int ans = linearsearch(nums, target); 
        System.out.println(ans);
    }

    static int linearsearch(int [] arr, int target){

        if(arr.length == 0){
            return -1;
        }
        
        for(int index = 0; index < arr.length; index++){

            int element = arr[index];
            if (element == target){
                return element;
            }
        /* Either way
         
        for(element : arr){
            if(element == target){
            return element;
            }
        }
        */
        }
        return -1;
    }
}

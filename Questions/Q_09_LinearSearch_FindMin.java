package DSA.Questions;

public class Q_09_LinearSearch_FindMin {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5,-6, 7, 8, 9};
        System.out.println(min(nums));
    }
    // assume arr.length != 0
    static int min(int [] arr){
        int ans = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > ans){ // for max: if(arr[i] > ans)
                ans = arr[i];
            }
        }
        return ans;

    }
}

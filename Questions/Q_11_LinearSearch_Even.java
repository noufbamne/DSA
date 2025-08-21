package DSA.Questions;

public class Q_11_LinearSearch_Even {
    public static void main(String[] args) {
        int [] nums ={12, 345, 2, 6, 7896};
        int ans = findnumbers(nums);
        System.out.println(ans);
    }

    static int findnumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigits = digits(num);
        if(numberofdigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        if(num < 0){
            num = num * -1; // for negative numbers
        }
        if (num == 0){
            return 1; // for 
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }
}

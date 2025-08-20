package DSA.Lecture_08;
import java.util.*;
public class PassinginFunctions {
    public static void main(String[] args) {
        int [] nums = {3, 2, 4, 5, 6};
        System.out.println(Arrays.toString(nums));
        
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int [] arr){
        arr [0]= 10;
    }
}

// Mutable behaviour
// strings immutable
// arrays mutable

package DSA.Lecture_08;
import java.util.*;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][]; // columns are not necessary to mention as size of inside arrays can vary.

        int [][] arr2d ={
            {1, 2, 3, 4, 5}, //0th index
            {6, 7, 8, 9, 10}, //1st index
            {11, 12, 13, 14, 15}, //2nd index -->arr2d[2] = {11, 12, 13, 14, 15};
        };
        System.out.println(arr2d[1][2]); //8----> 2nd row and 3rd column ---> index 1 array, index 2 element
    }
}

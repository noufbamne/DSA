package DSA.Lecture_08;
import java.util.*;
public class MultiDimension_2D_input {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println(arr.length);

        //input
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // output
        /*for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " "); 
                
                //1 2 3 4 5 6 7 8 9                                     
                //1 2 3 4 5 6 7 8 9
            }
            System.out.println();
            
            // 1 2 3 
            // 4 5 6
            // 7 8 9
        }*/

        for(int row = 0; row < arr.length; row++){
             System.out.println(Arrays.toString(arr[row]));
            
            /*[1, 2, 3]
              [4, 5, 6]
              [78, 8, 9]*/
        }
    }
}

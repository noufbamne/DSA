package DSA.Lecture_08;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        // arr [0] = 23;
        // arr [1] = 33;
        // arr [2] = 43;
        // arr [3] = 53;
        // arr [4] = 263;
        // // [23,33,43,53,263]
        // System.out.println(arr[3]);
// ---------------------------------------------------------------
        // Input using  for loop

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
// --------------------------------------------------------
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
// ---------------------------------------------------------
        // for(int num : arr){                       ----for every element in array, print the element
            // System.out.println(num +" ");}        ----here num represents elemnet
        // System.out.println(arr[5]);               ----index out of bound error
// ---------------------------------------------------------
        sc.close();
    }
}

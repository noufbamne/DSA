package DSA.Questions;
import java.util.Scanner;
public class Q_04_LargestNum {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter 3 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc. nextInt();

        int max = a;
        if(b > max ){
            max = b;
        }
        if (c > a){
            max = c;
        }
        else{
            max = a;
        }
        System.out.println("largest is: "+ max);
    }
}

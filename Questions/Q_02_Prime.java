package DSA.Questions;
import java.util.Scanner;

public class Q_02_Prime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num <= 1){
            System.out.println("Neither Prime nor Composite");
            return;   
        }

        int c = 2;
        while (c * c <= num) {   
            if (num % c == 0){
                System.out.println(num + " is not a Prime number.");
                return;          
            }
            c = c + 1;
        }
        System.out.println(num + " is a Prime number.");
        sc.close();
    }
}

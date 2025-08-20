package DSA.Questions;

import java.util.Scanner;

public class Q_03_Fahrenit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the temprature: ");
        float tempc = sc.nextFloat();

        float tempf = (tempc * 9 / 5) + 32;
        System.out.println("Temp is: "+ tempf);
        
    }
}

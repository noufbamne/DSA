package DSA.Lecture_06;
import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        float salary = sc.nextFloat();
        if(salary > 10000){
            salary = salary+2000;
            System.out.println(salary);
        }
        else{
            salary = salary + 1000;
            System.out.println(salary);
        }
        sc.close();
    }
}

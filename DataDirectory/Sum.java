package DataDirectory;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum Program");
        // System.out.println("Enter the first number: ");
        System.out.print("Please enter first number :");
        int firstNum = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("The sum of two numbers is: " + sum);
    }
    
}

package challenge;

import java.util.Scanner;

public class challenge_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitswise and operator");
        System.out.println("Please enter the first number ");
        int first = input.nextInt();
        System.out.println("Now, ENter the other number : ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is " + result);
    }
    
}

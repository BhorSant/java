package challenge;

import java.util.Scanner;

// create a program that takes two numbers and shows results of all arithmetic operators (+,-,*,/,%)

public class challenge_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Calculations:\n");
        System.out.println("Please enter first number:");
        int first = input.nextInt();
        System.out.println("Now, Please enter second number:");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mod = first % second;
        int div = first / second;
        int mul = first * second;
        System.out.println("Addition: " + add );
        System.out.println("Subraction: " + sub);
        System.out.println("Division: " + div);
        System.out.println("Multiplication: " + mul);
        System.out.println("modulus: " + mod);
    }
}

package challenge;

import java.util.Scanner;

public class challenge_1212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area of traingle");
        System.out.println("Please enter your base in cms :");
        double base = input.nextDouble();
        System.out.println("Now, enter your perimeter height in cms :");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of Traingle is " + area + "cm2");
        
    }
    
}

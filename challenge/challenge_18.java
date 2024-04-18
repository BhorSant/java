package challenge;

import java.util.Scanner;

public class challenge_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the World  of Three \n");
        System.out.println("Please enter your first number: ");
        int first = input.nextInt();
        System.out.println("Please enter your second number: ");
        int second = input.nextInt();
        System.out.println("Please enter your third number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + " First is greater than others.");

        }else if (second >= third && second >= third) {
            System.out.println(second + " Second is greater than others.");
        }else {
            System.out.println(third +" Third is greater than others.");
        }
}    
}

package challenge;

import java.util.Scanner;

public class challenge_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to oad and even number \n");
        System.out.print("Please enter a number");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("Your number is even");
        }else {
            System.out.println("Your number is odd");
        }

    }
    
}

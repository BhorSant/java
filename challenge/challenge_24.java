package challenge;

import java.util.Scanner;

public class challenge_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of not/compliment operator");
        System.out.println("Please enter your number :");
        int num = input.nextInt();
        int result =~ num;
        System.out.println("Your result is " + result);
    }
    
    
}

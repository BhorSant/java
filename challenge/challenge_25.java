package challenge;

import java.util.Scanner;

public class challenge_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase Leftshift Operator");
        System.out.println("PLease enter your number");
        int num = input.nextInt();

        int result = num << 4;
        System.out.println("Your result is " + result);
    }    
}

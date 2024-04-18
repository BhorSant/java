package challenge;

import java.util.Scanner;

public class challenge_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to number checker\n");
        System.out.print("Please enter your number :");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("YOur number is positive");

        }
        else if (num == 0){
            System.out.println("YOur number is zero");

        }else {
            System.out.println("YOur number is negative");
        }
    }
    
}

package challenge;

import java.util.Scanner;

class challenge_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd/Even Calculation");
        System.out.print("Please enter your number :");
        int num = input.nextInt();

        if ((num & 1 )==1){
            System.out.println("Your number is odd");
        }else {
            System.out.println("Your number is Even");
        }
    }
    
}

package Operators__IF_Else;

import java.util.Scanner;

public class relation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Diving License");
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if (age >= 18){
            System.out.println("You are eligible to drive");

        }
        else {
            System.out.println("You are not eligible to drive");
        }
    }
    
}

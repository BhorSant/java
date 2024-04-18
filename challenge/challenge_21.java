package challenge;

import java.util.Scanner;

public class challenge_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to age calculation");
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 65){
            System.out.println("you are a senior citizen");
        }else if (age>=20){
            System.out.println("you are an adult");
        }
        else if (age >= 13){
            System.out.println("you are teenager");
        }else {
            System.out.println("you are child");
        }
    
    }    
}

package challenge;

import java.util.Scanner;

public class challenge_15 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to Temperature converte");
        System.out.println("Enter the temperature in F : ");
        float fah = input.nextFloat();
        float cel = (fah - 32) * 5 / 9;
        System.out.println("Your Temperature is " + cel + "C");
        // System.out.println("Yout Temperature is ")
    }
    
}

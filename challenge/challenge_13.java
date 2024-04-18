package challenge;

import java.util.Scanner;

public class challenge_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to SImple Interest Calculator \n ");
        System.out.println("Please enter your principle amount Rs: ");
        int principle = input.nextInt();
        System.out.println("Now, Tell me yout rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Now, tell me how many year are you borrowed :");
        float years = input.nextFloat();
        float interest = (principle * rate * years)/100;
        System.out.println("\n The Simple interest is : " + interest);

    }
    
}

package challenge;
import java.util.Scanner;
import java.lang.Math;
public class challenge_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your principle amount Rs: ");
        int principle = input.nextInt();
        System.out.println("Now, Tell me yout rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Now, tell me how many year are you borrowed :");
        float years = input.nextFloat();
        // System.out.print("Now, tell me how many Compound Interests");
        double compInt = principle * Math.pow((1 + rate / 100),years);
        System.out.println("You Compund interest rate: " + compInt);
    }
    
}

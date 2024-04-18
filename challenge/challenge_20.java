package challenge;

import java.util.Scanner;

public class challenge_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade calculator");
        System.out.println("Please enter your percentage: ");
        float percentage = input.nextFloat();

        if (percentage >= 90){
            System.out.println("Greate, You have a A Grade");

        }else if (percentage >= 75){
            System.out.println("Greate, You have got B");

        }else if (percentage >= 60){
            System.out.println("Greate, You have got C, Work hard next time");

        }else if (percentage >=30){
            System.out.println("You have got D, YOu Seriously need to work hard next time");
        }else {
            System.out.println("I'm Sorry, YOu have Failed and you got F, Work hard next time");
        }
    }    
}

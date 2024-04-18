package challenge;

import java.util.Scanner;

public class challenge_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator");
        System.out.println("please enter the your that you want to check ");
        int year = input.nextInt();

        if (year % 400==0 || year % 100 !=0 && year %4 ==0){
            System.out.println("YOur year is a leap year");

       
        }else{
            System.out.println("Your year is not a leap year");
        }
    }
    
}

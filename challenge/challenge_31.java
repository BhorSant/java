package challenge;

import java.util.Scanner;

class challenge_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.println("Please enter your number ");
        int num = scanner.nextInt(); 
        int sum = sumOfDigits(num);
        System.out.println("sum of Digits is : " + sum);
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0){
            sum = sum + (num % 10);
            num /= 10;

        }
        return sum;
    }
    
}   

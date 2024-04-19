package function;

import java.util.Scanner;

public class Return_Statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("Please enter the number : ");
        int first = input.nextInt();
        System.out.println("Please enter the number : ");
        int second = input.nextInt();

        int sum = first + second;
        System.out.println("Sum of the numbers : " + sum);
        readNumber();
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("Please enter the number : ");
        int first = input.nextInt();
        return first;
    }
}

package challenge;
import java.util.Scanner;
public class challenge_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing FLoat Multiplication\n");
        System.out.println("Please enter first decimal number : ");
        double first = input.nextDouble();
        System.out.println("Now, Please enter second decimal number : ");
        double second = input.nextDouble();
        System.out.println("\nResult is " + first * second);
    }
}

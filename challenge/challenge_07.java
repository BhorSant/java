package challenge;
import java.util.Scanner;

public class challenge_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station\n\n");
        System.out.println("Enter value of A: ");
        int a = input.nextInt();
        System.out.println("Enter value of B: ");
        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapping Done ...");
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);

    }
    
}

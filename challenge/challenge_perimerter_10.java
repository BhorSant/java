package challenge;
import java.util.Scanner;
public class challenge_perimerter_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to perimeter");
        System.out.println("Please enter all 4 sided in cms");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double perimeter = (a + b + c + d);
        System.out.println("Perimeter of your rectangle" + perimeter+ "cm");
    }
    
}

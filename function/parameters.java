package function;

public class parameters {
    public static void main(String[] args) {
    

        System.out.println(sumtwoNumber(4,7));
        System.out.println(sumtwoNumber(88,22));
        System.out.println(sumtwoNumber(-64,-4));

    }

    public static int sumtwoNumber(int first, int second) {
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
        int sum = first + second;
        return sum;

    }
    
}

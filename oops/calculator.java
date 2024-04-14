package oops;
class Calculator
{
    public int add(int n1, int n2, int n3)
    {
        int result = n1 + n2;
        return result;
    }
}

public class calculator
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        int result = obj.add(10, 20, 30);
        System.out.println(result);
    }
}
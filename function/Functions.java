package function;

public class Functions {
    public static void main(String[] args) {
        // System.out.println("In main Methods");
        // greeting();
        // System.out.println("Method Calling complete");
        // greeting();
        printFirstPattern();
        // printSecondPattern();
        // printThirdPattern();

    }
    public static void printFirstPattern(){
        // System.out.println("Good morning from KGCoding");
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
        int rows = 0;
        while (rows < 5){
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
        }
        System.out.println("");
        rows++;
    }
    
    }
}

package Operators__IF_Else;

public class IF_ELSE {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "Parag";
        if (isMale==true) {
            System.out.println("Mr. " + name);
        }
        else {
            System.out.println("Ms. " + name);
        }

        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;
        if (isSeniorCitizen==true) {
            System.out.println("Hello Senior Citizen");
        } else{
            if (isAnAdult){
                System.out.println("HelloAdult");
                
            }else {
                System.out.println("Hello Child");
            }

        }

    }
    
}

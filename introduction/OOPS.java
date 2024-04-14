package introduction ;

class Computer {
    public void playMusic() {
        System.out.println("Playing music...");
    }

    public String getMeAPen(int price) {
        if (price>=10)
            return "pen";
        else
            return "no pen";
    }
}

public class OOPS {

    /**
     * Main method to test the OOPS class
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // create an instance of Computer class
        Computer obj = new Computer();
        
        // call the playMusic method of the Computer class
        obj.playMusic();
        
        // call the getMeAPen method of the Computer class
        // with argument price = 2
        String str = obj.getMeAPen(2);
        
        // print the string returned by getMeAPen
        System.out.println(str);
    }


}

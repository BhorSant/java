package oops;

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

    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);

    }

}

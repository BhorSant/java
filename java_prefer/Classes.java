package java_prefer;

class Mahesh {
    public int x;
    public int y;
    void fun1() {
        System.out.println("fun1");
    }

    void fun2() {
        System.out.println("fun2");
    }

    public static void main(String[] args) {
        // Mahesh maheshObject = new Mahesh();
        // maheshObject.fun1();
        // maheshObject.fun2();
    }
}

public class Classes {
    public static void main(String []args)
    {
        Mahesh maheshObject = new Mahesh();
        maheshObject.fun1();
        maheshObject.fun2();
        maheshObject.x = 10;
        System.out.println("Hello World");
        
        System.out.println(maheshObject.x);
    }
}

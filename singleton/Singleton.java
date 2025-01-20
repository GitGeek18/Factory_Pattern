package singleton;

public class Singleton {
    private static Singleton st;

    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    public static Singleton getInstance() {
        if (st == null) {
            st = new Singleton();
        }
        return st;
    }
}

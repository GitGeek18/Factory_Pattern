package singleton;
public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();


        if (obj1 ==obj2) {
            System.out.println("Both obj are  same.");
        } else {
            System.out.println("Both obj are different.");
        }
    }
}
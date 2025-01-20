package assign1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static  HashMap<Integer,Vehicle> mp= new HashMap<Integer,Vehicle>();
    static{
        mp.put(1,new Bike());
        mp.put(2,new Car());
        mp.put(3,new Bus());
        mp.put(4,new Truck());
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the offset");
        int offSet=sc.nextInt();
        System.out.println( mp.get(offSet).findWheelCount());


    }
}

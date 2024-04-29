import java.io.*;
import java.util.Scanner;


//method overloading
class Method {
    static void add(int a, int b) {
        int c = a + b;
        System.out.println("the sum is" + c);
    }


    static void add(double a, double b) {
        double c = a + b;
        System.out.println("the sum is" + c);
    }


    static void add(double a) {
        double c = a + 50.2;
        System.out.println("the sum is" + c);
    }


    public static void main(String args[]) {
        Method.add(4, 5);
        Method.add(4.5, 6.7);
        Method.add(7.5);
    }
}


// method overriding
class Bike {
    void run() {
        System.out.println("Bike is running");
    }
}


class Hero extends Bike {
    void run() {
        System.out.println("Hero bike is running");
    }
}


public class Runtime {
    public static void main(String[] args) {
        Bike h = new Hero();
        h.run();
    }
}

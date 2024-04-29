import java.io.*;
import java.util.Scanner;


interface Vehicle {
    void exists();
}


interface car {
    void wheels();
}


class Transport implements Vehicle, car {
    public void exists() {
        System.out.println("It is existing");
    }


    public void wheels() {
        System.out.println("It has four  wheels");
    }
}


public class Question14 {
    public static void main(String[] args) {
        Transport t1 = new Transport();
        t1.exists();
        t1.wheels();
    }
}

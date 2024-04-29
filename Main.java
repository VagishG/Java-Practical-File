import java.io.*;
import java.util.Scanner;


interface Shape {
    void area();


    void perimeter();
}


class Circle implements Shape {
    int r = 5;


    public void area() {
        double area = (3.14) * r * r;
        System.out.println("Area of circle:" + area);


    }


    public void perimeter() {
        double per = 2 * 3.14 * r;
        System.out.println("Perimter of circle:" + per);
    }
}


class Square implements Shape {
    int a = 10;


    public void area() {
        int area = a * a;
        System.out.println("Area of sqaure:" + area);
    }


    public void perimeter() {
        int per = 4 * a;
        System.out.println("Perimeter of square" + per);


    }
}


class Rectangle implements Shape {
    int l = 10;
    int b = 5;


    public void area() {
        int area = l * b;
        System.out.println("Area of rectangle:" + area);
    }


    public void perimeter() {
        int per = 2 * (l + b);
        System.out.println("Perimeter of rectangle:" + per);
    }
}


public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        c.area();
        c.perimeter();
        s.area();
        s.perimeter();
        r.area();
        r.perimeter();


    }
}



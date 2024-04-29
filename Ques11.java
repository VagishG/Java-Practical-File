import java.io.*;
import java.util.Scanner;


class box {
    int height;
    int width;
    int depth;


    box() {
        System.out.println("The defaukt constructor has been called");
    }


    box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }


    void volume() {
        int v = height * depth * width;
        System.out.println("Volume of the box:" + v);
    }
}


class box_new extends box {
    int weight;


    box_new(int w, int h, int d, int we) {
        super(we, h, d);
        weight = we;
    }


    void display() {
        System.out.println("Weight:" + weight);
    }
}


public class Ques11 {
    public static void main(String[] args) {
        box_new b = new box_new(23, 62, 20, 10);
        b.volume();
        b.display();
    }
}

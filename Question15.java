import java.io.*;
import java.util.Scanner;


class Question15 {
    public static void main(String args[]) {
        int a[] = { 2, 6 };
        int b = 5;
        try {
            int x = a[2] / b - a[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index error");
        } finally {
            System.out.println("finally always executed");
        }
    }
}

import java.io.*;
import java.util.Scanner;


class A {
    void show_me() {
        System.out.println("show inside A");
    }
}


class B extends A {
    void show_me() {
        System.out.println("show inside B");
    }
}


class C extends B {
    void show_me() {
        System.out.println("show inside C");
    }
}


class Main {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        A r;
        r = a;
        r.show_me();
        r = b;
        r.show_me();
        r = c;
        r.show_me();
    }
}

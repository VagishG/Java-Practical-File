class MyName implements Runnable {
    public void run() {
        System.out.println("My name is Anvi.");
    }
}


class HelloJava implements Runnable {
    public void run() {
        System.out.println("Hello Java");
    }
}


public class Qus20 {
    public static void main(String[] args) {


        MyName myName = new MyName();
        HelloJava helloJava = new HelloJava();


        Thread thread1 = new Thread(myName);
        Thread thread2 = new Thread(helloJava);


        thread1.start();
        thread2.start();
    }
}

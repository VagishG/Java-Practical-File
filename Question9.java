class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}

public class Question9 {
    public static void main(String[] args) {
        int x = 10;
        MyClass obj = new MyClass(20);

        System.out.println("Before callByValue - x: " + x);
        callByValue(x);
        System.out.println("After callByValue - x: " + x);

        System.out.println("Before callByReference - obj.value: " + obj.value);
        callByReference(obj);
        System.out.println("After callByReference - obj.value: " + obj.value);
    }

    public static void callByValue(int a) {
        a = 100;
    }

    public static void callByReference(MyClass obj) {
        obj.value = 200;
    }
}

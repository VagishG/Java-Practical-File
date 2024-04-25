class Sample{
    int Age;
    String Name;
    public Sample(){
        System.out.println("Constructor 1");
        Age=1;
        Name="Raj";
    }    
    public Sample(int age){
        System.out.println("Constructor 2");
        Age=age;
    }
    public Sample(int age,String name){
        Age=age;
        Name=name;
        System.out.println("Constructor 2");
    }
    public void Display(){
        System.out.println(Age);
        System.out.println(Name);
    }
}

public class Question7 {
    public static void main(String[] args) {
        Sample obj1=new Sample();
        Sample obj2 = new Sample(12);
        Sample obj3=new Sample(12,"Anuj");
        obj1.Display();
        obj2.Display();
        obj3.Display();
    }   
    
}
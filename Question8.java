public class Question8 {
    private static int count = 0;

    public Question8() {
        count++;
    }
    
    public static void main(String[] args) {
        Question8 obj1 = new Question8();
        Question8 obj2 = new Question8();
        Question8 obj3 = new Question8();
        
        System.out.println("Number of objects created: " + count);
    }
}

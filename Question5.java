import java.util.Scanner;

class Question5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The Number is not prime");
        }else{
            for(int i=3;i<n/2;i++){
                if(n%i==0){
                    System.out.println("The Number is not prime");
                    return;
                }
            }
            System.out.println("The number you entered is prime;");
        }
    }
}
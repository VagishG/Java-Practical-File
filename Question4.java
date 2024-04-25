import java.util.Scanner;
class Question4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();

        int prev = 0, curr = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(prev + " ");
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
    }
}
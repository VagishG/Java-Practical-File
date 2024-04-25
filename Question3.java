public class Question3 {
    public static void main(String[] args) {
        // Check if any command-line arguments are passed
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments:");
            // Loop through each command-line argument and print it
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}

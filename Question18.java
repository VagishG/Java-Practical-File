import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question18 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String line;
            System.out.println("Enter lines of text (type 'STOP' to end):");
            while (!(line = reader.readLine()).equals("STOP")) {
                System.out.println("You entered: " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class App {

    public static void main(String[] args) throws IOException {

        // (Write/read data) Write a program to create a file named Exercise12_15.txt if it does not exist. 
        java.io.File file = new java.io.File("Exercise12.15.txt");
        if (file.exists()) {
            System.out.println("File already exists");

            // Terminates the JVM
            System.exit(1);
        }

        // Creates an array with 100 randomly chosen integers.
        int[] array = new int[100]; 
        Random random = new Random();
    
        // Fill the array with random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000) + 1; 
        }

        // Write 100 integers created randomly into the file using text I/O. 
        // Integers are separated by spaces in the file.
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (int element : array) {
                writer.print(Integer.toString(element) + " ");
            }
        } catch (IOException e) {
            System.err.println("IO Error");
        }

        // Read the data back from the file
        // Reference: Page 434 The ArrayList Class
        // List<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while(input.hasNextInt()) {
                numbers.add(input.nextInt());
            }
        }

        // Display the data in increasing order
        numbers.sort(null);
        System.out.println("Data in increasing order: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}



/* --------- Unused Code ----------- */
// Collections.sort (Chapter 20, takes the ArrayList and sorts it in ascending order)
// Collections.sort(numbers);
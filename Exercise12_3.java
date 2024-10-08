// Added Scanner
import java.util.Scanner;
import java.util.Random;

public class Exercise12_3 {
    public static void main(String[] args) throws Exception {

        // Allow Scanner input
        Scanner input = new Scanner(System.in);

        // Creates an array with 100 randomly chosen integers.
        int[] array = new int[100]; 
        Random random = new Random();
    
        // Fill the array with random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000) + 1; 
        }
    
        // Breaker Line for Display purpose
        System.out.println();
        System.out.print("Array List: ");

        // Print the array
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Breaker Line for Display purpose
        System.out.println();

        // Prompts the user to enter the index of the array, then displays the corresponding element value.
        int id = -1;
        try {
            System.out.print("Enter a index value: ");
            id = input.nextInt();
            System.out.println(array[id]);
        }
        
        // If the specified index is out of bounds, display the message Out of Bounds.
        catch (Exception e) {
            System.out.print("Out of Bounds");
        }

        // Breaker Line for Display purpose
        System.out.println();

        // Close Scanner
        input.close();
    }
}

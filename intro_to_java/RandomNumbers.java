package intro_to_java;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();
        
        // Generate a random number
        int randomNumber = random.nextInt(100);  // Generates a random integer

        // Print the random number
        System.out.println("Random number: " + randomNumber);
    }
}


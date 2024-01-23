package week_four;

import java.time.Duration;
import java.time.Instant;

public class ChronoExample {

    // Returns elapsed time in nanoseconds using Instant and Duration classes
    public static long timeWithChrono() {
        // Get the current instant as the starting point
        Instant start = Instant.now();
        
        //// Run something
        System.out.println("Hello World");
        
        // Get the current instant as the ending point
        Instant end = Instant.now();

        // Calculate the elapsed time in nanoseconds
        long delta = Duration.between(start, end).toNanos();

        // Return the elapsed time
        return delta;
    }

    public static void main(String[] args) {
        // Call the timeWithChrono method to measure elapsed time
        long elapsedTime = timeWithChrono();

        // Print the elapsed time in nanoseconds
        System.out.println("Elapsed Time: " + elapsedTime + " nanoseconds");
    }
}


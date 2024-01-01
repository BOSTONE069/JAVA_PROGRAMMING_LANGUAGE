package week_three;

public class CountdownTimer implements Runnable {

    private int startValue;

    public CountdownTimer(int startValue) {
        this.startValue = startValue;
    }

    @Override
    public void run() {
        try {
            for (int i = startValue; i >= 1; i--) {
                System.out.println(i);
                Thread.sleep(500); // Add a short delay of 500 milliseconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create a new CountdownTimer object with a start value of your choice (e.g., 10).
        CountdownTimer countdownTimer = new CountdownTimer(15);

        // Create a new Thread object, passing the countdownTimer object as the Runnable target.
        Thread thread = new Thread(countdownTimer);

        // Start the thread by calling the start() method.
        thread.start();

        System.out.println("Main thread continues to execute...");
    }
}


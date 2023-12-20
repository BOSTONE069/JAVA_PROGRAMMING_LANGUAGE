package week_two;

public interface Operations {
    
    default int add(int a, int b) {
        return a + b;
    }

    static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
}

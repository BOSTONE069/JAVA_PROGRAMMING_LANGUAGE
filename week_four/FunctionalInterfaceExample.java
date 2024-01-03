package week_four;

@FunctionalInterface
interface Showable{
    void show();
}
public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        Showable obj = () -> System.out.println("Hello");
        obj.show();
    }
}

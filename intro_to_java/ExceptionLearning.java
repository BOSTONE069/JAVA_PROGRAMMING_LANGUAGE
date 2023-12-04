package intro_to_java;
public class ExceptionLearning {

    public static void main(String[] args) {
        try {
            // Block pf code to try
            int a = 11;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            // Block of code to nhandle error code
            System.out.println("The number cannot divided by zero.");
        }
    }
}
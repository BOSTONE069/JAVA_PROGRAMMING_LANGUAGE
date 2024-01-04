package week_four;

@FunctionalInterface
interface Sayable{
    void say();
}

public class InstanceMethodReference {
    public void saySomething(){
        System.out.println("This is an instance method.");
    }
    public static void main(String[] args) {
        // Creating an object:
        InstanceMethodReference methodReference = new InstanceMethodReference();
        // Referring to the instance method method using a method reference:
        Sayable sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();
    }
}  

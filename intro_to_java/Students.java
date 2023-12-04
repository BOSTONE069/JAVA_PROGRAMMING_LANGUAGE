// How can we make the Student class inherit from class Person?
package intro_to_java;

  public class Students extends Person{
     private int id;

    public static void main(String[] args) {
        Students s = new Students();
        System.out.println(s instanceof Students);
        System.out.println(s instanceof Person);
    }
  }
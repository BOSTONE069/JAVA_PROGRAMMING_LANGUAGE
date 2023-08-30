public class Person2 {
    private String name;

    public Person2(String name) {
        this.name = name;
    }

    public String getFood() {
        return "Hamburger";
    
    }

    public static void main(String[] args) {
        Person2 p = new Student("Collins");
        System.out.println(p.getFood());

        p = new Vegan("Vegan");
        System.out.println(p.name);
        System.out.println(p.getFood());
    }


}
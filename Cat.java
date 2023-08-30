/**
 * The `Cat` class is a subclass of the `Pet` class. It represents a cat and provides specific implementations for its behavior.
 */
class Cat extends Pet {

    /**
     * Constructor that takes a `name` parameter and initializes the `name` and `type` fields of the cat.
     * @param name The name of the cat.
     */
    public Cat(String name) {
        super(name, "cat");
    }

    /**
     * Overrides the `speak` method from the `Pet` class and returns the string "Meow!".
     * @return The string "Meow!".
     */
    @Override
    public String speak() {
        return "Meow!";
    }
}
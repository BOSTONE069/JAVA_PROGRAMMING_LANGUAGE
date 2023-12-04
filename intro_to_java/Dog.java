package intro_to_java;
/**
 * Represents a dog and provides specific functionalities and behaviors for dogs.
 */
class Dog extends Pet {
    
    /**
     * Constructor that initializes the name and type fields using the Pet class constructor.
     * @param name The name of the dog.
     */
    public Dog(String name) {
        super(name, "dog");
    }

    /**
     * Overrides the speak() method from the Pet class and returns "Woof!".
     * @return The dog's sound.
     */
    @Override
    public String speak() {
        return "Woof!";
    }
}
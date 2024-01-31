package l06.e00.pietrofornale;

public abstract class Animal {
    String name;

    public Animal(String aName) {
        name = aName;

    }
    abstract String makeSound();    // Defines abstract method
    // It has no instruction

    abstract void printAnimal();

}

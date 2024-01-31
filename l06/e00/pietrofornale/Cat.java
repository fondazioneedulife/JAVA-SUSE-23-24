package l06.e00.pietrofornale;

public class Cat extends Animal{  // Cat is a sub-class of Animal

    public Cat(String aName) {
        super(aName);   // Invokes parent class contructor
    }

    // Parent class Animal's Abstracts methods
    // are implemented into the sub-class

    public String makeSound() {
        return "Meow";
    }

    public void printAnimal() {
        System.out.println("Sound: " + makeSound());
    }
}

package l06.e00.pietrofornale;

public class Farm {
    private BetterDog dog;
    private Cat cat;
    private Animal[] pets;

    public Farm() {
        dog = new BetterDog("Bestia", false);
        cat = new Cat("Mao");
        pets = new Animal[2];
        pets[0] = dog;
        pets[1] = cat;
    }
    
    public void concert() {
        for (Animal a : pets) {
            System.out.println(a.makeSound());
        }

    }
}

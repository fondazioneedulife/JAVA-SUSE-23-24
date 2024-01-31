package l06.e00.pietrofornale;

public class BetterDog extends Animal{
    boolean barks;

    public BetterDog(String aName, boolean isBarking) {
        super(aName);
        barks = isBarking;
    }

    public void excited() {
        barks = true;
    }

    public void calm() {
        barks = false;
    }

    public String makeSound() {
        if (barks) {
            return ("Bark");
        }

        return "...";
    }

    public void printAnimal() {
        System.out.println("Sound: " + makeSound());
        System.out.println("Barking: " + this.barks);

    }


}

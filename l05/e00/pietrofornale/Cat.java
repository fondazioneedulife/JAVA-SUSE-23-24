public class Cat {
  String name;

  public Cat(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public String makeSound() {
    return "Meow";
  }

  public void printC() {
    System.out.println("Cat goes: " + makeSound());
  }
  
}

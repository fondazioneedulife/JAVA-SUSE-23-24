package l06.e00.pietrofornale;


public class Dog{    
    private String name;
  
    public Dog() {
        this.name = "";
    }
    
    public Dog(String name) {
        this.name = name;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
        this.name = name;
    }
  
    public String prefix() {
        return this.name.substring(0, 2);

    }
}
  
package l06.e05;
class Cane implements Animale{
    public void verso(){
        System.out.println("bau");
    }
}
class Gatto implements Animale{
    public void verso(){
        System.out.println("miao");
    }
}
interface Animale {
    public void verso();
}
public class Main {
    public static void main(String[] args) {
        Gatto myCat = new Gatto();
        myCat.verso();
        Cane myDog = new Cane();
        myDog.verso();
    }
}

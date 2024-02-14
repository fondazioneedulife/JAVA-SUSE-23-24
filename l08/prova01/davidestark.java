package l08.prova01;
import java.util.ArrayList;
import java.util.Random;
public class davidestark {
    public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 8; i++) {
        int randomNumber = random.nextInt() * (random.nextBoolean() ? 1 : -1);
        array.add(randomNumber);
    }

    System.out.println("lista numeri: " + array);
    int j = 0;
    int sommaNegativi = 0;
    for (j = 0; j < array.size(); j++) {
        if (array.get(j) < 0) {
            sommaNegativi += array.get(j);
            array.set(j, 0);
        }
        
        
    }
    System.out.println(array);
    System.out.println(sommaNegativi);
    }
}

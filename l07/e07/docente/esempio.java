package l07.e07.docente;

import java.util.HashSet;

public class esempio {
    public static void main(String[] args) {
        HashSet<String> corsi311 = new HashSet<String>();
        corsi311.add("Pixel");
        corsi311.add("Zorin");
        corsi311.add("Pascal");
        corsi311.add("Pixel");
        System.out.println(corsi311);
    }
}

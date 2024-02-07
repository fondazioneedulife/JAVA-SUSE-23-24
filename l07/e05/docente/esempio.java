package l07.e05.docente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class esempio {
    public static void main(String[] args) {
        HashMap<String, String> capitali = new HashMap<String, String>();
        capitali.put("Italia", "Roma");
        capitali.put("Francia", "Parigi");
        capitali.put("Irlanda", "Dublino");

        // per valore
        System.out.println("Visita per chiave:");
        for (String i : capitali.values()) {

            System.out.println(i);

        }

        // per chiave - valore
        System.out.println("Visita per chiave e valore");
        for (String i : capitali.keySet()) {

            System.out.println("key: " + i + " value: " + capitali.get(i));

        }

    }
}

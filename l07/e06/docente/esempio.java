package l07.e06.docente;

import java.util.HashMap;

public class esempio {
    public static void main(String[] args) {
        HashMap<Integer,Dipendente>azienda = new HashMap<Integer,Dipendente>();
        azienda.put(1, new Dipendente("Carlo", 2020));
        azienda.put(3, new Dipendente("Mattia", 2020));
        azienda.put(2, new Dipendente("Tommaso", 2021));
        System.out.println(azienda);
        /* 
        for(Integer i:azienda.keySet()){
            System.out.println(i);
        }
        for (Dipendente dipendente : azienda.values()) {
            System.out.println("Dipendente "+dipendente.getNome()+" assunto nel "+ dipendente.getDataAssunzione());
        }
        for(int i:azienda.keySet()){
            System.out.println("Chiave: "+i+" Valore: "+azienda.get(i));
        }
        */
    }
}

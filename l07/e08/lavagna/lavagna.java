package l07.e08.lavagna;

import java.util.ArrayList;

/*
 * Scrivere e testare una funzione sostituisci() che abbia come input un ArrayList di caratteri, un carattere valore1 e un carattere valore2.
che prende in input una ArrayLIst e due valori e ritorna una lista in cui tutte le occorrenze del valore1 sono sostituite da valore2.
Esempio :   
[‘p’,’i’,’p’,’p’,’o’],‘p’,‘l’
>>> [‘l’,’i’,’l’,’l’,’o’] 

 */

public class lavagna {
    public static void main(String[] args) {
     
        ArrayList a = new ArrayList();
        a.add('p');
        a.add('i');
        a.add('p');
        a.add('p');
        a.add('o');
        System.out.println(sostituisci(a, 'p','l'));
   
    }
}



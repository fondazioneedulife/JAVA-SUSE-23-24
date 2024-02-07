package l07.e08.docente;
import java.util.ArrayList;

public class esempio {
    public static void main(String[] args) {
        ArrayList<Character> lista = new ArrayList<>();
        lista.add('p');
        lista.add('i');
        lista.add('p');
        lista.add('p');
        lista.add('o');
        
        System.out.println(sostituisci(lista, 'p', 'l')); // Output: [l, i, l, l, o]
        
        ArrayList<String> listaStringhe = new ArrayList<>();
        listaStringhe.add("Hello");
        listaStringhe.add("World");
        
        System.out.println(concatena(listaStringhe)); // Output: HelloWorld
    }
    
    public static ArrayList<Character> sostituisci(ArrayList<Character> lista, char valore1, char valore2) {
        ArrayList<Character> nuovaLista = new ArrayList<>();
        for (char c : lista) {
            if (c == valore1) {
                nuovaLista.add(valore2);
            } else {
                nuovaLista.add(c);
            }
        }
        return nuovaLista;
    }
    
    public static String concatena(ArrayList<String> lista) {
        StringBuilder risultato = new StringBuilder();
        for (String s : lista) {
            risultato.append(s);
        }
        return risultato.toString();
    }
}
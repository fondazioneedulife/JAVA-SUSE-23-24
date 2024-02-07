package l07.e09.docente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class esempio {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeri = new ArrayList<>();
        listaNumeri.add(1);
        listaNumeri.add(2);
        listaNumeri.add(2);
        listaNumeri.add(3);
        listaNumeri.add(2);
        listaNumeri.add(2);
        listaNumeri.add(3);
        
        System.out.println(eliminaDuplicati(listaNumeri)); // Output: [1, 2, 3]
        System.out.println(riduciAdiacentiUguali(listaNumeri)); // Output: [1, 2, 3, 2, 3]
        
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        
        System.out.println(unisciListeOrdinate(lista1, lista2)); // Output: [1, 2, 3, 4, 5, 6]
    }
    
    public static Collection<Integer> eliminaDuplicati(ArrayList<Integer> lista) {
        HashSet<Integer> set = new HashSet<>(lista);
        return set;
    }
    
    public static ArrayList<Integer> riduciAdiacentiUguali(ArrayList<Integer> lista) {
        ArrayList<Integer> risultato = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (i == 0 || !lista.get(i).equals(lista.get(i - 1))) {
                risultato.add(lista.get(i));
            }
        }
        return risultato;
    }
    
    public static ArrayList<Integer> unisciListeOrdinate(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> risultato = new ArrayList<>();
        int i = 0, j = 0;
        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                risultato.add(lista1.get(i));
                i++;
            } else {
                risultato.add(lista2.get(j));
                j++;
            }
        }
        while (i < lista1.size()) {
            risultato.add(lista1.get(i));
            i++;
        }
        while (j < lista2.size()) {
            risultato.add(lista2.get(j));
            j++;
        }
        return risultato;
    }
}
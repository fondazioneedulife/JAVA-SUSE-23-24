package l07.e04.docente;

import java.util.ArrayList;
import java.util.Collections; 


public class esempio {
    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<Integer>();
            numeri.add(1);
            numeri.add(3);
            numeri.add(2);
            numeri.add(4);
            Collections.sort(numeri);  
            
            System.out.println(numeri);
 
    }
}

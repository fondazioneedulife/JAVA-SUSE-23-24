package esercizie06_funzioni;

/*
 1 Creare una funzione “sottrazione” che stampi il risultato della sottrazione tra due numeri dati in input. Lanciare la funzione creata più volte con input diversi.

 2 Crea una funzione che stampa una stringa (parametro 1) n volte (parametro 2). Creare sotto il codice per testare la funzione con una stringa, e un numero, dati in input

 3 Creare una funzione che dica se un numero, dato in input, è pari o dispari, in caso sia pari ritorna True, altrimenti ritorna False

 4  Un fattore ci chiede di indicargli quante zampe sono presenti fra i suoi animali.
    Il fattore possiede quattro specie:
    Gallina = 2 zampe
    Mucca = 4 zampe
    Maiale = 4 zampe
    Ragno = 8 zampe (ricco di proteine e che fa bene all’ambiente)
    Il contadino ha contato i suoi animali e ci fornisce il numero di ciascuna specie.
    Implementare la funzione che ritorna il numero totale di zampe di tutti gli animali.
    Esempi
    animali(2, 3, 5,1) ➞ 44
    animali(1, 2, 3,0) ➞ 22
    animali(5, 2, 8,0) ➞ 50
    Note
    Non dimenticarti di ritornare il valore
    L’ordine degli animali passato è animali(galline, mucche, maiali e ragni).
    Il contadino vuole che venga tornato il numero delle gambe e non il numero degli animali
 */

 public class sol {
    public static void main(String[] args){
        esA();
        esB("ciao", 3);
        esC(3);
        esD();
    }
    static void esA(){
        System.out.println(sottrazione(5,4));
        System.out.println(sottrazione(7,2));
        System.out.println(sottrazione(3,5));
    }
    static int sottrazione(int a, int b){
        return a-b;
    }
    static void esB(String str, int n){
        for(int i=0;i<n;i++)
            System.out.println(str);
    }
    static void esC(int a){
        if(a%2==0)
            System.out.println("Il numero è pari.");
        else
            System.out.println("Il numero è dispari");
    }
    static void esD(){
        System.out.println(animali(2, 3, 5, 1)); // ➞ 44
        System.out.println(animali(1, 2, 3, 0));// ➞ 22
        System.out.println(animali(5, 2, 8, 0));// ➞ 50
    }
    static int animali(int a, int b, int c, int d){
        return a*2+b*4+c*4+d*8;
    }
 }
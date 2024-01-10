package l03.e06.Cattedra;

/*
    Oggi lezione di creature magiche.
L’insegnante ci chiede di indicargli quante
zampe sono presenti fra i suoi animali.
Nel recinto sono presenti quattro specie:
Gallina = 2 zampe
Ippogrifo = 4 zampe
Snaso = 4 zampe
Schiopodo sparacoda = 8 zampe
Sono stati contati gli animali e viene
fornito il numero di ciascuna specie.
Ora quello che ci vuole è una funzione
che ritorni il numero totale di zampe di
tutti gli animali.
Esempi animali(2, 3, 5,1) ➞ 44
animali(1, 2, 3,0) ➞ 22
animali(5, 2, 8,0) ➞ 50
 */
 public class e06 {
    public static void main(String[] args){
       int sum = somma(2,4);
       System.out.println("la somma è "+sum);
    }
    static int somma(int a, int b){
        int j = a+b;
        return j;
    }
}

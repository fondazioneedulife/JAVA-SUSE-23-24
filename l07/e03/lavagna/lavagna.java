/*
 * Stampare i numeri pari da 1 a 100, poi stampare i numeri dispari da 1 a 40

 * Generare un array lungo 20 di numeri casuali compresi tra n ed m inseriti da utente, 
 * a questo punto stampare l’array e successivamente stamparlo capovolto
 *  (dall’ultimo elemento al primo) e raddoppiando ogni numero 

 * Scrivere un programma che individui il valore massimo e 
 * minimo all’interno di un array lungo n (inserito da utente) di numeri
 *  generati casualmente da -8 a 15

 */
public class lavagna{
    public static void main(String[] args) {
        //  Stampare i numeri pari da 1 a 100, poi stampare i 
        // numeri dispari da 1 a 40 e memorizzarli in due array
        int[] num1 = new int[50];
        int[] num2 = new int[20];
        for (int i = 0; i<100; i++ ){
            if(i%2==0)
                num1[i/2] = i;
        }

        for (int i = 0; i<40; i++ ){
            if(i%2!=0)
                num2[i/2] = i;
        }
        return;
        
    }
}
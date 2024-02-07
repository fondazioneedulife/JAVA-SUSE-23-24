package l07.e03.docente;

import java.util.Scanner;
import java.util.Random;

public class Soluzione {
    public static void main(String[] args) {
        // Stampare i numeri pari da 1 a 100
        System.out.println("Numeri pari da 1 a 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Stampare i numeri dispari da 1 a 40
        System.out.println("\nNumeri dispari da 1 a 40:");
        for (int i = 1; i <= 40; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Generare un array lungo 20 di numeri casuali compresi tra n ed m inseriti da utente
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInserisci il valore di n: ");
        int n = scanner.nextInt();
        System.out.print("Inserisci il valore di m: ");
        int m = scanner.nextInt();
        
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt((m - n) + 1) + n;
        }
        
        // Stampare l'array
        System.out.println("\nArray generato:");
        stampaArray(array);
        
        // Stampare l'array capovolto e raddoppiato
        System.out.println("\nArray capovolto e raddoppiato:");
        stampaArrayCapovoltoERaddoppiato(array);
        
        // Trovare il valore massimo e minimo nell'array
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("\nValore massimo: " + max);
        System.out.println("Valore minimo: " + min);
    }
    
    // Metodo per stampare un array
    public static void stampaArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Metodo per stampare un array capovolto e raddoppiato
    public static void stampaArrayCapovoltoERaddoppiato(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print((array[i] * 2) + " ");
        }
        System.out.println();
    }
}
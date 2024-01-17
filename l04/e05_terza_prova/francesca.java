package l04.e05_terza_prova;

/*
risolvere il problema illustrato sulla lavagna

uno no uno sì
1 3 5 7 9 11 13 15 17 19 21 23 ... 61
due no due sì
2 3 6 7 10 11 14 15 18 19 22 23 26 27 ... 62
quattro no quattro sì
4 5 6 7 12 13 14 15 24 25 26 27 28 29 30 31 40 ... 62
otto no otto sì
8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31 40 ... 62
sedici no sedici sì
16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 48 49 50 ... 62
trentadue no trentadue sì
32 33 34 35 36 37 ... 62

*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class francesca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeri = new ArrayList<Integer>();
        for (int i=0; i<=62; i++){
            List<Integer> aggiungi = Arrays.asList(i);
            numeri.addAll(aggiungi);
        }
        System.out.println("Pensa ad un numero");
        for (int i=1; i<=62; i+=2){
            System.out.print(i+" ");
        }
        System.out.println("Il numero è presente?");
        boolean uno = sc.nextBoolean();
        int start;
        if (uno) {
            start = 0;
        } else {   
            start = 1;
        }
        for (int i=start; i<=62; i+=2){
            numeri.remove(Integer.valueOf(i));
        }
        
        for (int i=2; i<=62; i+=4){
            for(int j=0; j<2; j++){
                System.out.print((i+j)+" ");
            }
        }
        
        System.out.println("Il numero è presente?");
        boolean due = sc.nextBoolean();
        if (due) {
            start = 0;
        } else {   
            start = 2;
        }
        for (int i=start; i<=62; i+=4){
            for(int j=0; j<2; j++){
                numeri.remove(Integer.valueOf((i+j)));
            }
        }
        for (int i=4; i<=62; i+=8){
            for(int j=0; j<4; j++){
                System.out.print((i+j)+" ");
            }
        }
        System.out.println("Il numero è presente?");
        boolean tre = sc.nextBoolean();
        if (tre) {
            start = 0;
        } else {   
            start = 4;
        }
        for (int i=start; i<=62; i+=8){
            for(int j=0; j<4; j++){
                numeri.remove(Integer.valueOf((i+j)));
            }
        }
        for (int i=8; i<=62; i+=16){
            for(int j=0; j<8; j++){
                System.out.print((i+j)+" ");
            }
        }
        
        System.out.println("Il numero è presente?");
        boolean quattro = sc.nextBoolean();
        if (quattro) {
            start = 0;
        } else {   
            start = 8;
        }
        for (int i=start; i<=62; i+=16){
            for(int j=0; j<8; j++){
                numeri.remove(Integer.valueOf((i+j)));
            }
        }
        for (int i=16; i<=62; i+=32){
            for(int j=0; j<16; j++){
                System.out.print((i+j)+" ");
            }
        }
        
        System.out.println("Il numero è presente?");
        boolean cinque = sc.nextBoolean();
        if (cinque) {
            start = 0;
        } else {   
            start = 16;
        }
        for (int i=start; i<=62; i+=32){
            for(int j=0; j<16; j++){
                numeri.remove(Integer.valueOf((i+j)));
            }
        }
        for(int j=0; j<32; j++){
            System.out.print((32+j)+" ");
        }
        
        System.out.println("Il numero è presente?");
        boolean sei = sc.nextBoolean();
        if (sei) {
            start = 0;
        } else {   
            start = 32;
        }
        for(int j=0; j<32; j++){
            numeri.remove(Integer.valueOf((start+j)));
        }

        System.out.println(numeri);
        
        sc.close();
    }
}

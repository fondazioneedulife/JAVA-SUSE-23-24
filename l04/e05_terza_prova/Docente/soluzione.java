package l04.e05_terza_prova.Docente;

import java.util.Scanner;

public class soluzione {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pensa a un numero!");
        int numero_pensato=0;
        System.out.println("Il numero pensato è tra questi?");
        lista_numeri(1);
        if(sc.nextInt()==1){
            numero_pensato+=1;
        }
        
        System.out.println("Il numero pensato è tra questi?");
        lista_numeri(2);
        if(sc.nextInt()==1){
            numero_pensato+=2;
        }
        System.out.println("Il numero pensato è tra questi?");
        lista_numeri(4);
        if(sc.nextInt()==1){
            numero_pensato+=4;
        }
        System.out.println("Il numero pensato è tra questi?");
        lista_numeri(8);
        if(sc.nextInt()==1){
            numero_pensato+=8;
        }
        System.out.println("Il numero pensato è tra questi?");
        lista_numeri(16);
        if(sc.nextInt()==1){
            numero_pensato+=16;
        }
        System.out.println("Il numero pensato è tra questi?");
        lista_numeri(32);
        if(sc.nextInt()==1){
            numero_pensato+=32;
        }
        System.out.println("Il numero pensato è "+numero_pensato);
    }
    static void lista_numeri(int numeri_da_saltare){
        int a = 0;
        boolean stampa = false;

        // 0 no 1 no 2 si 3 si 4 no 5 no 

        for(int i=0;i<63;i++){
            if(stampa){
                System.out.println(i-1+"\t");
            }
            if(i%numeri_da_saltare==0 && i !=0){
                stampa=!stampa;
            }
        }
        System.out.println("\n");
    }
}

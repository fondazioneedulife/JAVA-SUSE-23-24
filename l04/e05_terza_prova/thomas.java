package l04.e05_terza_prova;

import java.util.Scanner;

public class thomas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dim = 62;
        int[] arrAppoggio = new int[dim];
        int[] occorrSimil = new int[dim];
        String scelta = "";
        int numPens = 0;

        System.out.println("Pensa ad un numero minore di 62");

        for(int i=1; i<62; i=i+2){
            i = arrAppoggio[i];
            System.out.print(i + " ");
        }

        System.out.println("\nIl numero pensato che hai pensato è fra questi? (si/no)");
        scelta = sc.next(); 
        if(scelta.equals("si")){
            for(int i=1; i<62; i=i+2){
                occorrSimil[i] = arrAppoggio[i];
            }
            numPens += 1;
        }
        else{
            for(int i=0; i<62; i=i+2){
                occorrSimil[i] = arrAppoggio[i];
            }
        }
        System.out.println("\n");

        

        int printed = 0;
        for(int i=2; i<=62; i++){           
            if(printed < 2){
                System.out.print(i + " ");
                printed++;
            }
            else{
                printed = 0;
                i += 1;
            }
        }

        System.out.println("\nIl numero pensato che hai pensato è fra questi? ");
        System.out.println("\n");

        int printed2 = 0;
        for(int i=4; i<=62; i++){           
            if(printed2 < 4){
                System.out.print(i + " ");
                printed2++;
            }
            else{
                printed2 = 0;
                i += 3;
            }
        }

        System.out.println("\nIl numero pensato che hai pensato è fra questi? ");
        System.out.println("\n");

        int printed3 = 0;
        for(int i=8; i<=62; i++){           
            if(printed3 < 8){
                System.out.print(i + " ");
                printed3++;
            }
            else{
                printed3 = 0;
                i += 7;
            }
        }

        System.out.println("\nIl numero pensato che hai pensato è fra questi? ");
        System.out.println("\n");

        int printed4 = 0;
        for(int i=16; i<=62; i++){           
            if(printed4 < 16){
                System.out.print(i + " ");
                printed4++;
            }
            else{
                printed4 = 0;
                i += 15;
            }
        }

        System.out.println("\nIl numero pensato che hai pensato è fra questi? ");
        System.out.println("\n");

        int printed5 = 0;
        for(int i=32; i<=62; i++){           
            if(printed5 < 32){
                System.out.print(i + " ");
                printed5++;
            }
            else{
                printed4 = 0;
                i += 31;
            }
        }

        System.out.println("\nIl numero pensato che hai pensato è fra questi? ");
        System.out.println("\n");
    }
}

package l03.e04;

import java.util.Scanner;

public class DiegoZinelliNumberOrder {
    public static void main(String args[]){
        for (int i=2; i<=20; i+=2){
            if(i%2==0){
            System.out.println("Ordine pari: " + i);
        }
    }
    
        for (int i=40; i<50; i++){
            if(i%2==1){
            System.out.println("Ordine dispari: " + i);
            }
        }
    }
}
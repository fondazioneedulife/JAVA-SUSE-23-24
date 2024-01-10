package l03.e03;

import java.util.Scanner;

public class thomas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] nm = {"Aberforth","Bill","Charlie","Draco","Elphias","Fred","George",
                    "Harry","Ignotus","Lee","Malocchio","Neville","Oliver","Percy",
                    "Quirinius","Remus","Sirius","Tom","Unci"};

        String[] nf = {"Astoria","Bellatrix","Cho","Dolores","Eileen","Fleur","Ginny",
                    "Hermione","Irma","Luna","Mirtilla","Narcissa","Olympe","Pomona",
                    "Queenie","Rita","Sibilla","Tosca","Unci"};

        String[] cm = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
                    "P","Q","R","S","T","U","V","W","X","Y","Z"};

        String[] cf = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
                    "P","Q","R","S","T","U","V","W","X","Y","Z"};


        String cognome;
        String nome;
        int mf;
        String result = "";

        System.out.println("Inserisci il tuo nome: ");
        nome = sc.next();

        System.out.println("Inserisci il tuo cognome: ");
        cognome = sc.next();

        System.out.println("Sei maschio o femmina? (0/1) ");
        mf = sc.nextInt();

        if(mf == 0){
            for(int i=0; i<nm.length; i++){
                if(nome.charAt(0) == nm[i].charAt(0)){
                    result = result + nm[i];
                }
            }
            for(int i=0; i<cm.length; i++){
                if(cognome.charAt(0) == cm[i].charAt(0)){
                    result = result + cm[i];
                }
            }
        }
        else{
            for(int i=0; i<nf.length; i++){
                if(nome.charAt(0) == nf[i].charAt(0)){
                    result = result + nf[i];
                }
            }
            for(int i=0; i<cf.length; i++){
                if(cognome.charAt(0) == cf[i].charAt(0)){
                    result = result + cf[i];
                }
            }
        }
        

        System.out.println(result);
        sc.close();
    }
}

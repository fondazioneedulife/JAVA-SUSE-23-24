package l03.e07;

import java.util.Scanner;

public class thomas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Temperatura esterna? ");
        int temp = sc.nextInt();

        System.out.println("Piove? (si/no) ");
        String rain = sc.next();
        if(rain.equals("si")){
            flag = true;
        }
        else{
            flag = false;
        }


        if(flag == true && temp < 10){
            System.out.println("Rimani a letto a dormire");
        }

        else if(flag == true && temp > 10){
            System.out.println("Vai a piedi con l'ombrello");
        }

        else if(flag == false && temp < 10){
            System.out.println("Vestiti di più");
        }

        else{
            System.out.println("Vai con la scopa");
        }

    }       
}


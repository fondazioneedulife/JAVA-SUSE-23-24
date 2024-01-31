import java.util.Scanner;
public class renzo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String risposta;
        int numeroPensato = 0;
        System.out.println("Scegli un numero da 1 a 62");
        
        for(int i = 1; i < 63; i+=2){
            System.out.println(i);
        }
        
        System.out.println("Il tuo numero compare?\nS/N");
        risposta = sc.nextLine();
        if(risposta.equals("s")){
            numeroPensato += 1;
        }

        int salto = 2;
        for(int i = 0; i < 63; i++){
            if(i % salto == 0){
                i += salto;
            }
            System.out.print(i + " ");
        }

        System.out.println("Il tuo numero compare?\nS/N");
        risposta = sc.nextLine();
        if(risposta.equals("s")){
            numeroPensato += salto;
        }
        
        salto = 4;
        for(int i = 0; i < 63; i++){
            if(i % salto == 0){
                i += salto;
            }
            System.out.print(i + " ");
        }

        System.out.println("Il tuo numero compare?\nS/N");
        risposta = sc.nextLine();
        if(risposta.equals("s")){
            numeroPensato += salto;
        }

        salto = 8;
        for(int i = 0; i < 63; i++){
            if(i % salto == 0){
                i += salto;
            }
            System.out.print(i + " ");
        }

        System.out.println("Il tuo numero compare?\nS/N");
        risposta = sc.nextLine();
        if(risposta.equals("s")){
            numeroPensato += salto;
        }

        salto = 16;
        for(int i = 0; i < 63; i++){
            if(i % salto == 0){
                i += salto;
            }
            System.out.print(i + " ");
        }

        System.out.println("Il tuo numero compare?\nS/N");
        risposta = sc.nextLine();
        if(risposta.equals("s")){
            numeroPensato += salto;
        }

        salto = 32;
        for(int i = 0; i < 63; i++){
            if(i % salto == 0){
                i += salto;
            }
            System.out.print(i + " ");
        }

        System.out.println("Il tuo numero compare?\nS/N");
        risposta = sc.nextLine();
        if(risposta.equals("s")){
            numeroPensato += salto;
        }

        System.out.println("Numero pensato: " + numeroPensato);

        sc.close();
    }
}

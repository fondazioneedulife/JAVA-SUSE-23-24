package l03.e10;
public class severino{
    public static void main(String[] args){

        String frase = "Ciao";
        System.out.println("\nStampiamo la parola 10 volte");
        String accumulo = "";
        int i=0;
        while (i < 10){
        accumulo = accumulo + frase + " ";
        i = i+1;
        }
        System.out.println(accumulo);
        System.out.println("Ora stampiamo la parola 5 volte ma su righe diverse");
        while (i < 5) {
        System.out.println(frase);
        i=i+1;
        }

    }
}
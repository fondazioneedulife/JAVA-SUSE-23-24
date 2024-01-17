package l03.e10;

public class e10Diego {
    public static void main(String[] args) {
        
        String phrase = "Hello!";
        System.out.println("\nStampo la parola 10 volte:");
        String backlog = "";
        int i = 0;
        
        while (i < 10) {
            backlog = backlog + phrase + " ";
            i = i + 1;
        }
        System.out.println(backlog);
        System.out.println("Stampo la parola 5 volte su righe differenti:");
        while (i < 5) {
            System.out.println(phrase);
            i = i + 1;
        }
    }
    
}

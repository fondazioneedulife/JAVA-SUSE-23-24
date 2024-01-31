package StoriaTommy;

public class storia{

    public static final String reset = "\u001B[0m";
    public static final String red = "\u001B[31m";

    public static void main(String[] args) {
        dettagli dettagli = new ricordi();
        String personaggioPrincipale =colore(dettagli.getMainCharacter());
        String lavoro = colore(dettagli.getWork());
        String nemesi = colore(dettagli.getEnemy());
        String evento = colore(dettagli.getEvent());
        String attività = colore(dettagli.getActivity());
        
        String storiaccia = personaggioPrincipale + ", poverissimo " + lavoro + 
        ", sta facendo i conti come al solito con l'ennesimo\n " + nemesi + 
        ". La battaglia fu feroce e spietata come ogni dannatissimo lunedì, ma ecco che\n "
        + evento + ", che con " + attività + 
        ",\n non fece altro che deprimerlo ulteriormente, finendo per essere l'ennesima vittima del capitalismo moderno.\n Ah si, poi andò a comprarsi un panino dal kebabbaro e si sentì meno peggio\n";
        System.out.println(storiaccia);
    }
    
    static String colore(String a){
        return red + a + reset;
    }
}

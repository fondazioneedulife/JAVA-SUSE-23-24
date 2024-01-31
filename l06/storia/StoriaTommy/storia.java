package StoriaTommy;

public class storia{
    public static void main(String[] args) {
        dettagli dettagli = new ricordi();
        String storiaccia = dettagli.getMainCharacter() + ", poverissimo " + dettagli.getWork() + 
        ", sta facendo i conti come al solito con l'ennesimo\n " + dettagli.getEnemy() + 
        ". La battaglia fu feroce e spietata come ogni dannatissimo lunedì, ma ecco che\n "
        + dettagli.getEvent() + ", che con " + dettagli.getActivity() + 
        ",\n non fece altro che deprimerlo ulteriormente, finendo per essere l'ennesima vittima del capitalismo moderno.\n Ah si, poi andò a comprarsi un panino dal kebabbaro e si sentì meno peggio\n";
        System.out.println(storiaccia);
    }
    
}

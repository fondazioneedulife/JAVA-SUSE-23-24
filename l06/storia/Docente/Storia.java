package l06.storia.Docente;

public class Storia {
    public static final String reset = "\u001B[0m";
public static final String black = "\u001B[30m";
public static final String red = "\u001B[31m";
public static final String green = "\u001B[32m";
public static final String yellow = "\u001B[33m";
public static final String blue = "\u001B[34m";
public static final String purple = "\u001B[35m";
public static final String cyan = "\u001B[36m";
public static final String white = "\u001B[37m";
    public static void main(String[] args) {

        Dettagli dettagli = new Ricordi();
        String personaggioPrincipale=colore(dettagli.getMainCharacter());
        String antagonista=colore(dettagli.getEnemy());
        String lavoro=colore(dettagli.getWork());
        String eventoInatteso=colore(dettagli.getEvent());
        String attivita=colore(dettagli.getActivity());
        String titolo = "\n\n********** La nostra storia ************\n\n";
        String fine =   "\n****************************************\n\n";
        String laMiaStoria= titolo+ personaggioPrincipale + ", abile "+lavoro+", solcava il mare con la sua barca, la \"Sirena d'Argento\". In lontananza, spuntò una nave pirata guidata dal temibile "+//
         antagonista+". La battaglia fu feroce, ma con astuzia, Marco respinse l'assalto.\n" + 
                " Mentre la ciurma esultava, "+eventoInatteso+". " +personaggioPrincipale+" e la ciurma si misero a compiere "+attivita+", dimenticando le tensioni.\n" + //
                " Il sole tramontò, dipingendo il cielo di tonalità calde, tutti erano felici.\n" + //
                fine;
        System.out.println(laMiaStoria);
    }
    static String colore(String a){
        return green+a+reset;
    }
}

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
    public static final String titolo = "\n\n********** La nostra storia ************\n\n";
    public static final String fine =   "\n****************************************\n\n";
    public static void main(String[] args) {

        Dettagli dettagli = new Ricordi();
        String personaggioPrincipale=colore(dettagli.getMainCharacter());
        String antagonista=colore(dettagli.getEnemy());
        String lavoro=colore(dettagli.getWork());
        String eventoInatteso=colore(dettagli.getEvent());
        String attivita=colore(dettagli.getActivity());
        String laMiaStoria= "%s%s, abile %s, solcava il mare con la sua barca, la \"Sirena d'Argento\". In lontananza, spuntò una nave pirata guidata dal temibile %s. La battaglia fu feroce, ma con astuzia, %s respinse l'assalto.\n Mentre la ciurma esultava, %s. %s e la ciurma si misero a compiere %s, dimenticando le tensioni.\n %s Il sole tramontò, dipingendo il cielo di tonalità calde, tutti erano felici.\n%s";
        String result = String.format(laMiaStoria, titolo, personaggioPrincipale, lavoro, antagonista, personaggioPrincipale, eventoInatteso, personaggioPrincipale, personaggioPrincipale,attivita, fine);
        System.out.println(result);

    }
    static String colore(String a){
        return green+a+reset;
    }
}

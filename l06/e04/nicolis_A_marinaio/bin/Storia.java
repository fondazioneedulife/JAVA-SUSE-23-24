package l06.e04.nicolis_A_marinaio.bin;

public class Storia {
    public static void main(String[] args) {
        Dettagli dettagli = new Ricordi();
        String laMiaStoria = dettagli.getMainCharacter() + ", abile " + dettagli.getWork() + ", solcava il mare con la sua barca, la \"Sirena d'Argento\". In lontananza, spuntò una nave pirata guidata dal temibile " + dettagli.getEnemy() + ". La battaglia fu feroce, ma con astuzia, Marco respinse l'assalto.\n" + //
                "Mentre la ciurma esultava, " + dettagli.getEvent() + ". Marco e la ciurma si misero a compiere " + dettagli.getActivity() + ", dimenticando le tensioni.\n" + //
                "Il sole tramontò, dipingendo il cielo di tonalità calde. Quella giornata divenne leggenda, una storia di coraggio e magia tra le onde del vasto mare.\n" + //
                "";
        System.out.println(laMiaStoria);
    }
}

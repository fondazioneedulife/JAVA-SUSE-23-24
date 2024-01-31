package Storia_1;

public class storia_gianmarco {
    public static void main(String[] args) {

        Dettagli dettagli = new Ricordi();
        String laMiaStoria= dettagli.getMainCharacter()  + dettagli.getWork() + ", scavava la terra con la sua pala, la \"Sirena d'Argento\". In lontananza, spuntò una nave pirata guidata dal temibile " + dettagli.getEnemy() + ". La battaglia fu feroce, ma con astuzia, Mic respinse l'assalto.\n" + //
                "Mentre la ciurma esultava," + dettagli.getEvent() + ". Mic e la ciurma si misero a compiere " + dettagli.getActivity() + ", dimenticando le tensioni.\n" + //
                "Il sole tramontò, dipingendo il cielo di tonalità calde. Quella giornata divenne leggenda, una storia di coraggio e magia tra le onde del vasto mare.\n" + //
                "";
        System.out.println(laMiaStoria);
    }
}

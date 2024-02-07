package Storia_1;

public class storia_gianmarco {
    public static void main(String[] args) {

        Dettagli dettagli = new Ricordi();
        String laMiaStoria= dettagli.getMainCharacter()  + dettagli.getWork() + ", scavava la terra con il suo badile, la \"pala letale\". In lontananza, spuntò uno zombie, il temibile  " + dettagli.getEnemy() + ". La battaglia fu feroce, ma con astuzia e grazie alla sua pala, Mic respinse l'assalto.\n" + //
                "Mentre il mic esultava, " + dettagli.getEvent() + ". Mic lo perdonò e " + dettagli.getActivity() + ", dimenticando le tensioni.\n" + //
                "Il sole tramontò, dipingendo il cielo di tonalità calde. Quella giornata divenne leggenda, una storia di coraggio e passione nella buca.\n" + //
                "";
        System.out.println(laMiaStoria);
    }
}

package l06.storia.Diego_Story;

public class Storypirate {
    public static void main(String[] args) {
        Details Details = new Remembrances();

        String Story = Details.getMainChar() + ", " + Details.getWork() + ", solcava il mare con la sua barca, la \"Sirena d'Argento\". \nIn lontananza, spuntò una nave pirata guidata dal temibile " + Details.getEnemy() + ". La battaglia fu feroce, ma con astuzia, Marco respinse l'assalto.\n" + //
                "Mentre la ciurma esultava, " + Details.getEvent() + ". Marco e la ciurma decisero di intraprendere" + Details.getEvent2() + ", che li portarono alla isola di Lattuga. \n" + //
                "Approdati e scesi dalla nave, la ciurma trovò in un bar. Entrando e trovando un tavolo libero, " + Details.getActivity() + ", dimenticando le tensioni.\n" + //
                "Il sole tramontò, dipingendo il cielo di tonalità calde. Quella giornata divenne leggenda, una storia di coraggio e magia tra le onde del vasto mare.\n" + //
                "";
        System.out.println(Story);
    }
}



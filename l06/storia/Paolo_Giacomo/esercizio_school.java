package l06.storia.Paolo_Giacomo;

public class esercizio_school {
    public static void main(String[] args) {

        get_info d = new info_classi();

        String laMiaStoria = d.getMainCharacter()+", abile "+d.getWork()+", solcava il mare con la sua barca, la \"Sirena d'Argento\". In lontananza, spuntò una nave pirata guidata dal temibile "+d.getEnemy()+". La battaglia fu feroce, ma con astuzia, Marco respinse l'assalto.\n" + //
                "Mentre la ciurma esultava, "+d.getEvent()+". Marco e la ciurma videro"+ d.getActivity()+", e li, si risollevarono le tensioni.\n" + //
                "Il sole tramontò, dipingendo il cielo di tonalità calde. Quella giornata divenne leggenda, una storia di coraggio e magia tra le onde del vasto mare.\n" + //
                "";

        System.out.println(laMiaStoria);
    }
}



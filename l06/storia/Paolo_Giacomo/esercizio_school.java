package Paolo_Giacomo;

public class esercizio_school {
    public static void main(String[] args) {

        get_info d = new info_classi();

        String laMiaStoria = d.getMainCharacter()+", abile "+d.getWork()+", solcava il mare con la sua barca, la \"Sirena del Frosinone\". In lontananza, spuntò una nave albina guidata dal temibile "+d.getEnemy()+". La battaglia fu feroce ed esaltante, tra battaglie e amori, ma con astuzia, Fernando respinse l'assalto.\n" + //
                "Mentre la ciurma esultava e applaudiva, "+d.getEvent()+". Ernesto e la ciurma videro la dolce "+ d.getActivity()+", e li, si risollevarono dalle tensioni.\n" + //
                "Il sole tramontò, dipingendo il cielo di tonalità calde come il faccino di Maria. Quella giornata divenne leggenda, una storia di coraggio e magia tra le onde e le paglie immerse nel vasto mare delle Tre Marie.\n" + //
                "";

        System.out.println(laMiaStoria);
    }
}



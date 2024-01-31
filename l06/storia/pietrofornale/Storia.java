package pietrofornale;


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

        String mainCharacter = colore(dettagli.getMainCharacter());
        String enemy = colore(dettagli.getEnemy());
        String work = colore(dettagli.getWork());
        String event = colore(dettagli.getEvent());
        String activity = colore(dettagli.getActivity());
        String title = "\n\n********** La nostra storia ************\n\n";
        String ending = "\n****************************************\n\n";


        String laMiaStoria = title + mainCharacter + ", abile " + work + ", solcava il mare con il suo veivolo volante, il \"Boeing 757\". In lontananza, spuntò una coppia di edifici imponenti di proprietà degli " + enemy + ". La battaglia fu feroce, ma con astuzia, " + mainCharacter + " le affondò.\n" + //
                "Mentre la ciurma esplodeva, in Afghanistan " + activity + ", dimenticando le tensioni.\n" + //
                "Il sole tramontò, dipingendo il cielo di tonalità calde. Quella giornata divenne leggenda, una storia di coraggio e magia tra i venti del vasto cielo.\n" + ending;
        System.out.println(laMiaStoria);

    }

    static String colore(String a){
        return green+a+reset;
    }
    
}

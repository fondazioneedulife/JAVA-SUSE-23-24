public class PericoloTroll {
    public static void main(String[] args) {
        System.out.println("'Un Troll nei sotterranei!!'' (Io ve l'ho detto ...uh!)\n Inserisci l'incantesimo:");
        String incantesimo = "";
        int tentativi = 3;
        boolean riuscita = false;
        for (int i = 1; i!=tentativi; i++){
            if (incantesimo == "Vingardium Leviosa"){
                System.out.println("Bravi siete riusciti a fuggire");
                riuscita = true;
                break;
            }
        }
        if (riuscita == false){
            System.out.println("E niente siete stati mangiati ;(");
        }
    }
}

package l05.e01.Docente;
// Classe base per rappresentare una persona magica
class PersonaMagica {
    String nome;
    boolean mago;
    boolean mezzosangue;
    boolean animagus;

    public PersonaMagica(String nome, boolean mago, boolean mezzosangue, boolean animagus) {
        this.nome = nome;
        this.mago = mago;
        this.mezzosangue = mezzosangue;
        this.animagus = animagus;
    }

    public void descrizione() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + (mago ? "Mago" : "Babbano"));
        System.out.println("Mezzosangue: " + (mezzosangue ? "Sì" : "No"));
        System.out.println("Animagus: " + (animagus ? "Sì" : "No"));
    }
}

// Classe per rappresentare uno studente di Hogwarts
class Studente extends PersonaMagica {
    String casa;

    public Studente(String nome, boolean mago, boolean mezzosangue, boolean animagus, String casa) {
        super(nome, mago, mezzosangue, animagus);
        this.casa = casa;
    }

    // Possibili metodi specifici per gli studenti
    public void partecipaLezioni() {
        System.out.println(nome + " sta partecipando alle lezioni di Hogwarts.");
    }
}

// Classe per rappresentare un professore di Hogwarts
class Professore extends PersonaMagica {
    String materiaInsegnata;

    public Professore(String nome, boolean mago, boolean mezzosangue, boolean animagus, String materiaInsegnata) {
        super(nome, mago, mezzosangue, animagus);
        this.materiaInsegnata = materiaInsegnata;
    }

    // Possibili metodi specifici per i professori
    public void tieneLezione() {
        System.out.println(nome + " sta tenendo una lezione su " + materiaInsegnata + ".");
    }
}

// Esempio di utilizzo delle classi
public class soluzione {
    public static void main(String[] args) {
        Studente harry = new Studente("Harry Potter", true, false, false, "Grifondoro");
        Professore snape = new Professore("Severus Snape", true, true, false, "Pozioni");

        harry.descrizione();
        harry.partecipaLezioni();

        System.out.println("\n");

        snape.descrizione();
        snape.tieneLezione();
    }
}

package l08.prova06.Docente;
/*
 * Si produca un esempio di codice Java che illustri
 * l'ereditarietà delle classi con studenti e professori di Hogwarts,
 * considerando la possibilità che siano maghi o mezzosangue e animagus.
 * I professori insegnano una materia, gli studenti hanno un anno
 * di iscrizione, con un opportuno metodo viene restituito se sono
 * al primo anno, secondo ecc. Gli studenti appartengono ad una casa.
 */

public class Docente{
    public static void main(String[] args) {
        Professore p = new Professore();
        Studente s = new Studente();
        p.setAnimagus(true);
        p.setMezzosangue(false);
        p.setMateria("cura delle creature magiche");
        s.setAnimagus(true);
        s.setMezzosangue(true);
        s.setCasa("Grifondoro");
        return ;

        
    }
}

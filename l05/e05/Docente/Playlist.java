package l05.e05.Docente;

public class Playlist {
    private Canzone[] playlist;

    // Costruttore che prende come parametro il vettore di canzoni
    public Playlist(Canzone[] playlist) {
        this.playlist = playlist;
    }

    // Metodo per modificare il titolo di una canzone
    public void modificaTitolo(int pos, String titolo) {
        if (pos >= 0 && pos < playlist.length) {
            playlist[pos].setNome(titolo);
        } else {
            System.out.println("Posizione non valida.");
        }
    }

    // Metodo per modificare il cantante di una canzone
    public void modificaCantante(int pos, String cantante) {
        if (pos >= 0 && pos < playlist.length) {
            playlist[pos].setCantante(cantante);
        } else {
            System.out.println("Posizione non valida.");
        }
    }

    // Metodo per modificare la durata di una canzone
    public void modificaDurata(int pos, int durata) {
        if (pos >= 0 && pos < playlist.length) {
            playlist[pos].setDurata(durata);
        } else {
            System.out.println("Posizione non valida.");
        }
    }

    // Metodo toString per restituire una stringa con l'intera playlist
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Playlist:\n");

        for (int i = 0; i < playlist.length; i++) {
            result.append(i + 1).append(". ").append(playlist[i]).append("\n");
        }

        return result.toString();
    }
}

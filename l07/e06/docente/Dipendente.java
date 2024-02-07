package l07.e06.docente;

public class Dipendente {
    private String nome; // Represents the name of the employee
    protected int dataAssunzione; // Represents the hiring date of the employee
    
    public Dipendente(String a, int b){
        this.nome = a;
        this.dataAssunzione = b;
    }
    public String getNome() {
        return nome; // Retrieves the name of the employee
    }
    
    public void setNome(String nome) {
        this.nome = nome; // Sets the name of the employee
    }
    
    public int getDataAssunzione() {
        return dataAssunzione; // Retrieves the hiring date of the employee
    }
    
    public void setDataAssunzione(int dataAssunzione) {
        this.dataAssunzione = dataAssunzione; // Sets the hiring date of the employee
    }
    
    @Override
    public String toString() {
        return "Dipendente [nome=" + nome + ", dataAssunzione=" + dataAssunzione + "]"; // Provides a customized string representation of the Dipendente object
    }
}
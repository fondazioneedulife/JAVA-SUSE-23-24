package l06.e02.docente;

public class Soluzione {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Auto auto = new Auto("Toyota", 2022, 2000, 4, "Benzina");
        Moto moto = new Moto("Honda", 2021, 1000, "Due tempi");
        Furgone furgone = new Furgone("Ford", 2020, 2500, 10);

        garage.immettiVeicolo(0, auto);
        garage.immettiVeicolo(5, moto);
        garage.immettiVeicolo(10, furgone);

        garage.stampaSituazione();

        VeicoloAMotore veicoloEstratto = garage.estraiVeicolo(5);

        if (veicoloEstratto != null) {
            System.out.println("Veicolo estratto: " + veicoloEstratto);
        }

        garage.stampaSituazione();
    }
}

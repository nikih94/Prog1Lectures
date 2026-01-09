package SLO.PrimerKolokvija;

public class Tovornjak extends Vozilo{

    double nosilnost;

    public Tovornjak(String barva, int stKoles, double nosilnost) {
        super(barva, stKoles);
        this.nosilnost = nosilnost;
    }

    @Override
    public void izpisi() {
        super.izpisi();
        System.out.println("Nosilnost: "+nosilnost);
    }
}

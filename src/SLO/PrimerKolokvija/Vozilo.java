package SLO.PrimerKolokvija;

public class Vozilo {

    String barva;
    int stKoles;

    public Vozilo(String barva, int stKoles) {
        this.barva = barva;
        this.stKoles = stKoles;
    }

    public void izpisi(){
        System.out.println("Barva: "+barva+"\n"+"stKoles: "+stKoles);
    }


    public static void main(String[] args) {
        Tovornjak t = new Tovornjak("bela",12,2331.2);
        Motor m = new Motor("rumena");

        t.izpisi();
        m.izpisi();
        System.out.println("Check!");
    }
}

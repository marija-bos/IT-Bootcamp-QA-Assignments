package DomaciOOPsreda;

public class SastojakRecepta extends Sastojak{

    private double kolicinaSastojka;


    public SastojakRecepta(String nazivSastojka, double cenaSastojka, double kolicinaSastojka) {
        super(nazivSastojka, cenaSastojka);
        this.kolicinaSastojka = kolicinaSastojka;
    }

    public double getKolicinaSastojka() {
        return kolicinaSastojka;
    }

    public void setKolicinaSastojka(double kolicinaSastojka) {
        this.kolicinaSastojka = kolicinaSastojka;
    }

    public double ukupnaCena(){
        return kolicinaSastojka * getCenaSastojka();
    }
}

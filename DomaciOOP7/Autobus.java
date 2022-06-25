package DomaciOOP7;

public class Autobus{
    private String naziv;
    private Vozac vozac;
    private int cenaKarte;
    private Putnik putnik;

    public Autobus(String naziv, Vozac vozac, int cenaKarte, Putnik putnik) {
        this.naziv = naziv;
        this.vozac = vozac;
        this.cenaKarte = cenaKarte;
        this.putnik = putnik;
    }

    public String getNaziv() {
        return naziv;
    }

    public Vozac getVozac() {
        return vozac;
    }

    public int getCenaKarte() {
        return cenaKarte;
    }

    public Putnik getPutnik() {
        return putnik;
    }

    public void setVozac(Vozac vozac) {
        this.vozac = vozac;
    }

    public void setPutnik(Putnik putnik) {
        this.putnik = putnik;
    }
}

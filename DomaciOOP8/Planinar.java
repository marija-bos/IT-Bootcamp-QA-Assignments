package DomaciOOP8;

public abstract class Planinar {

    private int ID;
    private String ime;
    private String prezime;

    public Planinar(int ID, String ime, String prezime) {
        this.ID = ID;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getID() {
        return ID;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public abstract String stampaj();
    public abstract double clanarina();
    public abstract String uspesanUspon(Planina p);

}

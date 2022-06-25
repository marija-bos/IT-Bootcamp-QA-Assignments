package DomaciOOP7;

public abstract class Covek {
    private String ime;
    private String prezime;

    public Covek(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Covek() {
        this.ime = "";
        this.prezime = "";

    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
}

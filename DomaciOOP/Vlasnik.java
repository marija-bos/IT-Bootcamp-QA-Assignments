package DomaciOOP;

public class Vlasnik extends Automobil{
      private String ime;
      private String prezime;

      public Vlasnik(String marka, String model, int serijskiBroj, String ime, String prezime) {
          super(marka, model, serijskiBroj);
          this.ime = ime;
          this.prezime = prezime;
      }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}

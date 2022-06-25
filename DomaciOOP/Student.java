package DomaciOOP;

public class Student {

    private String imeIPrezime;
    private int brojIndeksa;
    private String smer;
    private RezultatIspita rezultatIspita;

    public Student(String imeIPrezime, int brojIndeksa, String smer, RezultatIspita rezultatIspita) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.smer = smer;
        this.rezultatIspita = new RezultatIspita(rezultatIspita.getR1(), rezultatIspita.getR2(), rezultatIspita.getR3(), rezultatIspita.getR4(), rezultatIspita.getR5());
    }

    public Student() {
        this.imeIPrezime = "";
        this.brojIndeksa = 0;
        this.smer = "";
        this.rezultatIspita = new RezultatIspita();
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }

    public RezultatIspita getRezultatIspita() {
        return rezultatIspita;
    }

    public void setRezultatIspita(RezultatIspita rezultatIspita) {
        this.rezultatIspita = rezultatIspita;
    }





}

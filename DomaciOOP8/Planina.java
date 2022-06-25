package DomaciOOP8;

public class Planina {

    private String imePlanine;

    private String drzava;
    private double visinaPlanine;

    public Planina(String imePlanine, String drzava, double visinaPlanine) {
        this.imePlanine = imePlanine;
        this.drzava = drzava;
        this.visinaPlanine = visinaPlanine;
    }
    public Planina() {
        this.imePlanine = "";
        this.drzava = "";
        this.visinaPlanine = 0;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}

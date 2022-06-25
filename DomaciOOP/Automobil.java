package DomaciOOP;

public class Automobil {

    private String marka;
    private String model;
    private int serijskiBroj;



    public Automobil(String marka, String model, int serijskiBroj){
            this.marka = marka;
            this.model = model;
            this.serijskiBroj = serijskiBroj;

    }

    public Automobil() {
        this.marka = "";
        this.model = "";
        this.serijskiBroj = 0;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }





    @Override
    public String toString() {
        return "Automobil{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", serijskiBroj=" + serijskiBroj +

                '}';
    }
}

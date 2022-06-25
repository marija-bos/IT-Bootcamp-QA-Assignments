package DomaciOOP8;

public class Alpinista extends Planinar{
    private int brojPoena;

    public Alpinista(int ID, String ime, String prezime, int brojPoena) {
        super(ID, ime, prezime);
        this.brojPoena = brojPoena;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    @Override
    public double clanarina() {
        int cl = 1500 - (getBrojPoena() * 50);
        return cl;
    }

    @Override
    public String uspesanUspon(Planina p) {
        if(p.getVisinaPlanine() < 4000){
            return "Uspon je uspesan.";
        }
        else {
            return "Uspon nije uspesan";
        }
    }

    @Override
    public String stampaj() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alpinista, id: ").append(getID()).append("\n");
        sb.append("Ime: ").append(getIme()).append(" ").append(getPrezime()).append("\n");
        sb.append("Broj poena: ").append(getBrojPoena());
        return sb.toString();
    }
}

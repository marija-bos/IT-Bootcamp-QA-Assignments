package DomaciOOP8;

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String nazivOkruga;
    private double maxUspon;

    public RekreativniPlaninar(int ID, String ime, String prezime, int tezinaOpreme, String nazivOkruga, double maxUspon) {
        super(ID, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public String uspesanUspon(Planina p) {
        if(getMaxUspon() - getTezinaOpreme() * 50 > p.getVisinaPlanine()){
            return "Uspon je uspesan";
        }
        else return "Uspon nije uspesan";

    }

    @Override
    public String stampaj() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rekreativac, id: ").append(getID()).append("\n");
        sb.append("ime: ").append(getIme()).append(" ").append(getPrezime()).append("\n");
        sb.append("Okrug: ").append(getNazivOkruga());
        return sb.toString();
    }
}

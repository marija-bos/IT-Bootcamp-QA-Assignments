package DomaciOOPsreda;

import java.util.ArrayList;

public class Recept {
    private String imeRecepta;
    private int tezinaRecepta;
    private ArrayList<SastojakRecepta> sastojci;


    public Recept(String imeRecepta, int tezinaRecepta, ArrayList<SastojakRecepta> sastojci) {
        this.imeRecepta = imeRecepta;
        this.tezinaRecepta = tezinaRecepta;
        this.sastojci = sastojci;
    }

    public Recept() {
        this.sastojci = new ArrayList<>();
    }

    public String getImeRecepta() {
        return imeRecepta;
    }

    public void setImeRecepta(String imeRecepta) {
        this.imeRecepta = imeRecepta;
    }

    public int getTezinaRecepta() {
        return tezinaRecepta;
    }

    public void setTezinaRecepta(int tezinaRecepta) {
        this.tezinaRecepta = tezinaRecepta;
    }

    public ArrayList<SastojakRecepta> getSastojci() {
        return sastojci;
    }


    public void setSastojci(ArrayList<SastojakRecepta> sastojci) {
        this.sastojci = sastojci;
    }

    public void dodajSastojak(SastojakRecepta s) {
        sastojci.add(s);
    }

    private boolean daLiSuIsti(SastojakRecepta s1, SastojakRecepta s2) {
        if (s1.getNazivSastojka() == s2.getNazivSastojka()
                && s1.getCenaSastojka() == s2.getCenaSastojka()
                && s1.getKolicinaSastojka() == s2.getKolicinaSastojka()) {
            return true;
        }
        return false;
    }

    public void ukloniSastojak(SastojakRecepta s3) {
        for (int i = 0; i < sastojci.size(); i++) {
            SastojakRecepta trenutni = sastojci.get(i);
            if (daLiSuIsti(trenutni, s3)) {
                sastojci.remove(i);
                return;
            }
        }


    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(imeRecepta).append(":").append("\n");
        if (tezinaRecepta == 1) {
            sb.append("Tezina: pocetni nivo.").append("\n");
        } else if (tezinaRecepta == 2) {
            sb.append("Tezina: lak nivo.").append("\n");
        } else if (tezinaRecepta == 3) {
            sb.append("Tezina: srednji nivo.").append("\n");
        } else if (tezinaRecepta == 4) {
            sb.append("Tezina: tezak nivo.").append("\n");
        } else if (tezinaRecepta == 5) {
            sb.append("Tezina: majstorski nivo").append("\n");
        }
        sb.append("Sastojci: ");
        for(SastojakRecepta sa : sastojci){
            sb.append(sa.getNazivSastojka() + ", ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(".");

        return sb.toString();
    }
}
package DomaciOOPsreda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Sastojak brasno = new Sastojak("brasno", 2.5);
        SastojakRecepta brasno1 = new SastojakRecepta("brasno", 2.5, 300);
        SastojakRecepta jogurt = new SastojakRecepta("jogurt", 2, 200);
        SastojakRecepta kakao = new SastojakRecepta("kakao", 5, 50);
        SastojakRecepta ulje = new SastojakRecepta("ulje", 10, 100);
        ArrayList<SastojakRecepta> sast = new ArrayList<>();
        sast.add(brasno1);
        sast.add(jogurt);
        sast.add(kakao);

        Recept torta = new Recept("torta", 3, sast);

        System.out.println(torta);

        torta.dodajSastojak(ulje);
        torta.ukloniSastojak(brasno1);

        System.out.println("--------");

        System.out.println(torta);

        System.out.println(kakao.ukupnaCena());


    }
}

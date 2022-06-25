package DomaciOOP8;

import java.util.ArrayList;

public class TestKlasa {

    public static void main(String[] args) {

        Planina Midzor = new Planina("Midzor", "Srbija", 2169);
        ArrayList<Planinar> pla = new ArrayList<>();
        RekreativniPlaninar Joca = new RekreativniPlaninar(92328, "Joca", "Jocic", 15, "Banat", 2000);
        RekreativniPlaninar Doca = new RekreativniPlaninar(43763, "Doca", "Docic", 20, "Backa", 3000);
        RekreativniPlaninar Goca = new RekreativniPlaninar(57553, "Goca", "Gocic", 5, "Beograd", 1500);
        Alpinista Raja = new Alpinista(74372, "Raja", "Rajic", 32);
        Alpinista Gaja = new Alpinista(53262, "Gaja", "Gajic", 12);
        Alpinista Vlaja = new Alpinista(36546, "Vlaja", "Vlajic", 40);

        pla.add(Joca);
        pla.add(Doca);
        pla.add(Goca);
        pla.add(Raja);
        pla.add(Gaja);
        pla.add(Vlaja);


        double cl = 0;
        for(Planinar p : pla){
            System.out.println(p.stampaj());
            System.out.println(p.uspesanUspon(Midzor));
            System.out.println("---------------");
            cl += p.clanarina();
            System.out.println("Ukupan zbir clanarina je: " + cl);
        }



    }
}

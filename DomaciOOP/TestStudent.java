package DomaciOOP;

import java.util.Scanner;

public class TestStudent {


    public static void main(String[] args) {
    RezultatIspita rezM = new RezultatIspita();
    Student Marija = new Student("Marija Boskovic", 29, "etnologija i antropologija", rezM);
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj poena.");
        double rez = sc.nextDouble();
        rezM.setR1(rez);

        rezM.daLiJePolozio();


    }
}

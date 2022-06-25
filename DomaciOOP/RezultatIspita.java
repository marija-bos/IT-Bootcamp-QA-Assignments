package DomaciOOP;

public class RezultatIspita {
     public double r1;
     private double r2;
     private double r3;
     private double r4;
     private double r5;

     public RezultatIspita(double r1, double r2, double r3, double r4, double r5) {
          this.r1 = r1;
          this.r2 = r2;
          this.r3 = r3;
          this.r4 = r4;
          this.r5 = r5;
     }
     public RezultatIspita() {
          this.r1 = 0;
          this.r2 = 0;
          this.r3 = 0;
          this.r4 = 0;
          this.r5 = 0;
     }

     public double getR1() {
          return r1;
     }

     public void setR1(double r1) {
          this.r1 = r1;
     }

     public double getR2() {
          return r2;
     }

     public void setR2(double r2) {
          this.r2 = r2;
     }

     public double getR3() {
          return r3;
     }

     public void setR3(double r3) {
          this.r3 = r3;
     }

     public double getR4() {
          return r4;
     }

     public void setR4(double r4) {
          this.r4 = r4;
     }

     public double getR5() {
          return r5;
     }

     public void setR5(double r5) {
          this.r5 = r5;
     }


     public void daLiJePolozio() {
          if (r1 >= 51) {
               System.out.println("Student je polozio ispit sa " + this.r1 + " poena.");
          } else {
               System.out.println("Student nije polozio ispit sa " + this.r1 + " poena.");
          }
     }
}

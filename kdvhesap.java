import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvOran, kdv18Tutar = 0.18, kdv8Tutar = 0.08, kdvliTutar, kdvsizTutar;

        Scanner inptutar = new Scanner(System.in);

        System.out.print("Tutarı Giriniz: ");

        tutar = inptutar.nextDouble();
        kdvOran = (tutar >= 0 && tutar < 1000) ? kdv18Tutar : kdv8Tutar;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        kdvsizTutar = tutar;


        System.out.println("Kdv'siz Tutar: " + " " + kdvsizTutar );
        System.out.println("Kdv Oranı:" + " " + kdvOran);
        System.out.println("Kdv Tutarı:" + " " + kdvTutar);
        System.out.println("Kdv'li Tutar: " + " " + kdvliTutar);

    }
}

import java.util.Scanner;
public class test3 {
    public static void  main(String[] args) {
        double pi = 3.14, yariCap, alan, cevre, formul;
        int aci;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz: ");
        yariCap = input.nextDouble();
        System.out.print("Açı Giriniz: ");
        aci = input.nextInt();

        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;
        formul = ((pi * (yariCap * yariCap) * aci)) / 360;


        System.out.println("Daire'nin Alanı: " + alan);
        System.out.println("Daire'nin Çevresi: " + cevre);
        System.out.println(aci + " Derecenin Alanı " + formul);

    }
}

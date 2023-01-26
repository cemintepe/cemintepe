import java.util.Scanner;
public class test3 {
    public static void  main(String[] args) {
        double kgArmut = 2.14, kgElma = 3.67, kgDomates = 1.11, kgMuz = 0.95, kgPatlican = 5.00, total;
        int armut, elma, domates, muz, patlican;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo: ");
        armut = input.nextInt();
        System.out.print("Elma Kaç Kilo: ");
        elma = input.nextInt();
        System.out.print("Domates Kaç Kilo: ");
        domates = input.nextInt();
        System.out.print("Muz Kaç Kilo: ");
        muz = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo: ");
        patlican = input.nextInt();

        total = (armut * kgArmut) + (elma * kgElma) + (domates * kgDomates) + (muz * kgMuz) + (patlican * kgPatlican);

        System.out.print("Toplam Tutar: " + total + " TL");

    }
}

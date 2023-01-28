import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int km, yas, way, indirimliTutar, toplamTutar, yasIndirim, yasOran, ciftYon;
        double perKm = 0.10, normalTutar;

        /* yasIndirim = normalTutar * yasOran;
        indirimliTutar = normalTutar - yasIndirim;
        ciftYon = indirimliTutar * 0.20;
        toplamTutar = (indirimliTutar - ciftYon) * 2; */

        Scanner input = new Scanner(System.in);

        System.out.print("KM Cinsinden Mesafe Giriniz: ");
        km = input.nextInt();

        if (km <= 0) {
            System.out.println("Mesafe 0'dan Küçük Olamaz");
        } else {
            System.out.print("Yaşınızı Giriniz: ");
        }

        yas = input.nextInt();
        if (yas <= 0) {
            System.out.println("Yaş Sıfırdan Küçük Olamaz.");
        } else {
            System.out.println("Yolculuk Tipini Seçiniz:\n1-Tek Yön\n2-Çift Yön");
        }
        way = input.nextInt();
        if (!(way == 1) && !(way == 2)) {
            System.out.println("Hatalı Seçim Yaptınız");
        } else {
            System.out.println("Mesafe: " + km);
            System.out.println("Yaşınız: " + yas);
            System.out.println("Yolculuk Tipiniz:" + way);
        }

        normalTutar = km * perKm;

        switch (way) {
            case 1:
                if (yas < 12) {
                    System.out.println("Bilet Ücreti: " + (normalTutar * 0.5));
                } else if (yas >= 12 && yas < 25) {
                    System.out.println("Bilet Ücreti: " + (normalTutar * 0.9));
                } else if (yas >= 65) {
                    System.out.println("Bilet Ücreti: " + (normalTutar * 0.7));
                } else {
                    System.out.println("Bilet Ücreti: " + normalTutar);
                }
                break;
            case 2:
                if (yas < 12){
                    System.out.println("Bilet Ücreti: " + ((normalTutar * 0.5) * ( 2 * 0.8 )));
                } else if (yas >= 12 && yas < 25){
                    System.out.println("Bilet Ücreti: " + ((normalTutar * 0.9) * ( 2 * 0.8 )));
                }else if ( yas >= 65) {
                    System.out.println("Bilet Ücreti: " + ((normalTutar * 0.7) * ( 2 * 0.8 )));
                } else {
                    System.out.println("Bilet Ücreti: " + (normalTutar * ( 2 * 0.8 )));
                }
                break;

        }

    }
}

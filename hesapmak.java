import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int n1, n2, secim;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayınızı Giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme ");
        System.out.print("Hangi İşlemi Yapmak İstiyorsunuz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                sonuc = n1 + n2;
                System.out.println("Toplam: " + sonuc);
                break;
            case 2:
                sonuc = n1 - n2;
                System.out.println("Çıkarma: (İlk Sayı - İkinci Sayı): " + sonuc);
                break;
            case 3:
                sonuc = n1 * n2;
                System.out.println("Çarpım: " + sonuc);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bir Sayı 0'a Bölünemez");
                    break;
                } else {
                    sonuc = n1 / n2;
                    System.out.println("Bölme: (İlk Sayı / İkinci Sayı): " + sonuc);
                    break;
                }
            default:
                System.out.println("Yanlış Seçim Tekrar Deneyin");
        }

        System.out.println("\n");

        /*

        if (secim == 1) {
            System.out.println("Toplam: " + (n1 + n2));
        } else if (secim == 2) {
            System.out.println("Çıkarma (n1-n2): " + (n1 - n2));

        } else if (secim == 3) {
            System.out.println("Çarpma: " + (n1 * n2));

        } else if (secim == 4) {
            if (n2 != 0) {
                System.out.println("Bölme (n1/n2): " + (n1 / n2));
            } else {
                System.out.println("Bir Sayı 0'a Bölünemez");
            }
        }else {
            System.out.println("Yanlış Seçim, Tekrar Deneyin");
        }

         */

    }
}

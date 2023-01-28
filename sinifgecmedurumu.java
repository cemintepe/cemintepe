import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        if ((mat >= 0 && mat < 101) && (fizik >= 0 && fizik < 101) && (turkce >= 0 && turkce < 101)
                && (kimya >= 0 && kimya < 101) && (muzik >= 0 && muzik < 101)) {
            System.out.println("Girilen Tüm Notlar 0-100 Aralığında");
            if ((turkce < 45)) {
                System.out.println("Türkçe Dersi 45'ten Düşük Olduğu İçin Sınıfta Kaldınız");
                return;
            }
        } else {
            System.out.println("Notlar 0 - 100 Aralığında olmalıdır.");
            return;
        }

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if (ortalama <= 55) {
            System.out.print("Sınıfta Kaldınız\n" + "Ortalamanız: " + ortalama);
        } else {
            System.out.println("Sınıfı Geçtiniz \n" + "Ortalamanız: " + ortalama);
        }

        System.out.println("Ortalamanız: " + ortalama);
    }
}

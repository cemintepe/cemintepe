import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        // degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sinif tanimla
        Scanner inp = new Scanner(System.in);

        // Verileri kullanicidan al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik = inp.nextInt();

        // Tum Notları Topla, Ders Sayısına Böl

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Not Ortalamanız: " + sonuc);

        String str = sonuc >= 60.0 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(str);



    }
}

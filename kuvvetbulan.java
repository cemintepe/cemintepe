import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int k, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        k = input.nextInt();
        System.out.print("4'ün Kuvvetleri: ");
        for (int i = 1; i <= k; i *= 4) {
            System.out.print(i + " ");
            toplam += i;
        }
        int ilktoplam = toplam;
        System.out.print("\n4'ün Katları Toplamı: " + toplam);
        System.out.println();
        System.out.print("5'in Kuvvetleri: ");
        for (int i = 1; i <=k; i *= 5){
            System.out.print(i + " ");
            toplam += i;
        }
        System.out.print("\n5'in Katları Toplamı: " + (toplam - ilktoplam));
        System.out.print("\nSayıların Toplamı: \n" + toplam);
    }
}


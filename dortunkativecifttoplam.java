import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, toplam = 0;

        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                toplam += n;
            }
        } while (n % 2 == 0);
        System.out.println("4'ün Katı Sayıların Toplamı: " + toplam);
    }
}


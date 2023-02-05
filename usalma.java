import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int n,k;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayıyı Girin: ");
        n = input.nextInt();
        System.out.print("Üs Olacak Sayıyı Girin: ");
        k = input.nextInt();

        int toplam = 1;

        for(int i=1 ; i <= k ; i++ ){
            toplam *= n;
        }
        System.out.print("Cevap: " + toplam);
    }
}

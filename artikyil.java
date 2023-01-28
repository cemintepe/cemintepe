import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner (System.in);

        System.out.print("Yil Giriniz: ");
        yil = input.nextInt();

        if (yil % 400 == 0){
            System.out.print(yil + " bir Artık Yıldır.");
        }else {
            System.out.print(yil + "  bir Artik Yıl Değildir");
        }
    }
}

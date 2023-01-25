import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int a, b, c, cevre, alan, u;

        Scanner ucgen = new Scanner(System.in);

        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        a = ucgen.nextInt();
        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        b = ucgen.nextInt();
        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        c = ucgen.nextInt();

        cevre =  a + b + c;
        u = cevre/2;
        alan = u*(u-a)*(u-b)*(u-c);

        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: " + alan);


    }
}

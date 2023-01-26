import java.util.Scanner;
public class test3 {
    public static void  main(String[] args) {
        int kilo;
        double vKitle, boy;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu Giriniz: ");
        kilo = input.nextInt();

        vKitle = kilo / (boy * boy);
        System.out.println("Vucut Kitle Index: " + vKitle);
        
    }
}

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int n, r, u = 1, totalN = 1, totalR = 1, totalU = 1, combination = 1;
        System.out.println("C[n,r] = n! / r! * (n-r)!\n\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("C[n,r] n Sayısını Giriniz: ");
        n = scan.nextInt();

        System.out.print("C[n,r] r Sayısını Giriniz: ");
        r = scan.nextInt();

        u = n - r;

        System.out.println("\nn = " + n);
        System.out.println("r = " + r);
        System.out.println("(n-r) = " + u + "\n") ;


        if (u < 0) {
            System.out.println("Hatalı Giriş");
            return;
        } else {


            for (int i = 1; i <= n; i++) {
                totalN *= i;
            }
            System.out.println(n +"! = " + totalN);

            for (int z = 1; z <= r; z++) {
                totalR *= z;
            }
            System.out.println(r +"! = " + totalR);

            for (int y = 1; y <= u; y++) {
                totalU *= y;
            }
            System.out.println((n-r) + "! = " + totalU + "\n");
        }


        combination = (totalN / (totalR * totalU));


        System.out.println("Combination Result: " + combination);
    }
}


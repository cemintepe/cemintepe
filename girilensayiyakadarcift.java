import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        for(int i = 1 ; i <= k ; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        }
    }


-------------------------------------------
    
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int k, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        while (i <= k) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}




import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        String user, pass;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        user = inp.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        pass = inp.nextLine();

        if (user.equals("patika") && pass.equals("Java101")) {
            System.out.println("Giriş Yaptınız");
        } else if (!user.equals("patika") || !pass.equals("Java101")) {
            System.out.println("Hatalı Giriş Yaptınız\nŞifrenizi Sıfırlamak İstermisiniz?\n1-Evet\n2-Hayır");
            System.out.print("Seçiminiz: ");

            int secim = inp.nextInt();

            switch (secim){
                case 2:
                    System.out.println("Daha Sonra Tekrar Deneyiniz");
                    break;
                case 1:
                    String newPass;
                    Scanner inp2 = new Scanner(System.in);
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    newPass = inp2.nextLine();
                    if (newPass.equals(pass)){
                        System.out.println("Eski Şifreniz ile Aynı Olamaz");
                    } else {
                        System.out.println("Yeni Şifre Oluşturuldu");
                    }
                    break;
                default:
                    System.out.println("Hatalı bir Giriş Yaptınız.");
            }

        }

    }
}


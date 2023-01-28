import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz Ay : ");
        month = input.nextInt();
        System.out.println("Doğduğunuz Gün : ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.print("Burcunuz Oğlak !");
                } else {
                    System.out.println("Burcunuz Kova !");
                }
            } else {
                System.out.print("Ocak ayı 31 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day <= 19) {
                    System.out.print("Burcunuz Kova !");
                } else {
                    System.out.println("Burcunuz Balık! ");
                }
            } else {
                System.out.print("Şubat ayı 28 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    System.out.print("Burcunuz Balık !");
                } else {
                    System.out.println("Burcunuz Koç !");
                }
            } else {
                System.out.print("Mart ayı 31 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    System.out.print("Burcunuz Koç !");
                } else {
                    System.out.println("Burcunuz Boğa !");
                }
            } else {
                System.out.print("Nisan ayı 30 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.print("Burcunuz Boğa !");
                } else {
                    System.out.println("Burcunuz İkizler !");
                }
            } else {
                System.out.print("Mayıs ayı 31 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    System.out.print("Burcunuz İkizler !");
                } else {
                    System.out.println("Burcunuz Yengeç !");
                }
            } else {
                System.out.print("Haziran ayı 30 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.print("Burcunuz Yengeç !");
                } else {
                    System.out.println("Burcunuz Aslan !");
                }
            } else {
                System.out.print("Temmuz ayı 31 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.print("Burcunuz Aslan !");
                } else {
                    System.out.println("Burcunuz Başak !");
                }
            } else {
                System.out.print("Ağustos ayı 31 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    System.out.print("Burcunuz Başak !");
                } else {
                    System.out.println("Burcunuz Terazi !");
                }
            } else {
                System.out.print("Eylül ayı 30 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.print("Burcunuz Terazi !");
                } else {
                    System.out.println("Burcunuz Akrep !");
                }
            } else {
                System.out.print("Ekim ayı 31 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    System.out.print("Burcunuz Akrep !");
                } else {
                    System.out.println("Burcunuz Yay !");
                }
            } else {
                System.out.print("Kasım ayı 30 gündür, geçersiz giriş yaptınız.");

            }
        } else if (month == 12) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    System.out.print("Burcunuz Yay !");
                } else {
                    System.out.println("Burcunuz Oğlak !");
                }
            } else {
                System.out.print("Ocak ayı 30 gündür, geçersiz giriş yaptınız.");

            }

        }else {
            System.out.println("Hatalı Giriş Yaptınız.");
        }
    }
}



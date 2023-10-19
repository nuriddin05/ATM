package ATM;

import java.util.Scanner;

import static ATM.Constants.*;

public class ATM {
    static long[] kartalar = {8600000000000000L, 9860000000000000L, 8600000000000001L, 9860000000000001L};
    static int kartaParoli = 50_00;
    static int[] kartaParollari = {40_00, 50_00, 60_00, 70_00};
    static int kartaPuli = 1_000_000;
    static int[] kartaPullari = {1_000_000,2_000_000,3_000_000,4_000_000};

    static char til = 'u';
//    'e' yoki 'u';

    static final double PI = 3.14;

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Tilni tanlang, Choose language
                    1.English
                    2.Uzbek
                    """);
            int tanlanadiganTil = (new Scanner(System.in)).nextInt();
            if (tanlanadiganTil == 1) {
                til = 'e';
            } else if (tanlanadiganTil == 2) {
                til = 'u';
            } else {
                System.out.println("Xato kiritding,default uzbek tanlandi");
            }
            System.out.println(til == 'e' ? FIRST_MESSAGE_EN : FIRST_MESSAGE);
            int userKiritganParol = (new Scanner(System.in)).nextInt();
            if (userKiritganParol == kartaParoli) {
                boolean chiqish = true;
                while (chiqish) {
                    menu();
                    int kMRaqami = (new Scanner(System.in)).nextInt();
                    switch (kMRaqami) {
                        case 1:
                            balansniKorish();
                            break;
                        case 2:
                            naqdPulOlish();
                            break;
                        case 3:
                            parolniOzgartirish();
                            break;
                        case 4:
                            valyuteAlmashtirish();
                            break;
                        case 5:
                            chiqish = false;
                            System.out.println("Kartani oling");
                            break;
                        default:
                    }
                }
            } else {

                System.out.println("Parol xato kirtildi kartani oling!\n" +
                        "Karta olindi");
            }
        }

    }

  private   static void valyuteAlmashtirish() {
        System.out.println(til == 'e' ? CURRENCY_MENU_EN : CURRENCY_MENU_UZ);
        int valyutaMenuNumber = (new Scanner(System.in)).nextInt();
        if (valyutaMenuNumber == 1) dollarKursAlishtir();
        else if (valyutaMenuNumber == 2) yevroKursAlishtir();
        else if (valyutaMenuNumber == 3) rublKursAlishtir();
        else if (valyutaMenuNumber == 0) System.out.println("Menudan chiqdingiz");
        else System.out.println("Kiritilgan sonda menu mavjud emas");
    }

   private static void rublKursAlishtir() {
        // todo uyga
    }

 private    static void yevroKursAlishtir() {
        //todo uyga
    }

   private static void dollarKursAlishtir() {
        System.out.println("Summani kiriting");
        int yechiladiganSumma = (new Scanner(System.in)).nextInt();
        if (kartaPuli > yechiladiganSumma * DOLLAR_KURSI) {
            kartaPuli -= yechiladiganSumma * DOLLAR_KURSI;
            System.out.println("Operatriya m . b ,Pulingizni oling");
        } else System.out.println("Pulingiz yetmaydi");
    }


   private static void balansniKorish() {
        System.out.println("Sizning balansizgiz " + kartaPuli);
    }

  private   static void naqdPulOlish() {
        System.out.println("Summani kiriting: ");
        int yechiladiganSumma = (new Scanner(System.in)).nextInt();
        if (yechiladiganSumma <= kartaPuli) {
            kartaPuli = kartaPuli - yechiladiganSumma;
            System.out.println("Pullarni oling");
        } else {
            System.out.println("Mablag' yetarli emas");
        }
    }

 private    static void parolniOzgartirish() {

        System.out.println("Yangi parolni kiritish uchun eski parolni kiriting");
        int kiritiladiganEskiParol = (new Scanner(System.in)).nextInt();
        if (kiritiladiganEskiParol == kartaParoli) {
            System.out.println("Yangi parolni kiriting,4 xonali bo'lsin");
            int yangiParol = (new Scanner(System.in)).nextInt();
            //camel case yangiParol - variable,methods,...
            //pascal case KiritiladiganYangiParol - class
            //kebab case kiritiladigan-yangi-parol
            //snake case kiritiladigan_yangi_parol - constants
            if (yangiParol > 999 && yangiParol < 10000) {
                //todo 0000,0001 shular haqida ishlash
                kartaParoli = yangiParol;
                System.out.println("O'zgartirildi");
            } else {
                System.out.println("Xato: 4 xonali emas");
            }

        } else {
            System.out.println("Parol Xato kiritildi, qayta urinib ko'ring");
        }
    }


  private   static void menu() {
        System.out.println(til == 'e' ? MENU_MESSAGE_EN : MENU_MESSAGE);
    }
}

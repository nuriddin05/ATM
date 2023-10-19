package ATM;

import java.util.Scanner;

import static ATM.Constants.*;

public class ATM2 {
    static long[] kartalar = {8600000000000000L, 9860000000000000L, 8600000000000001L, 9860000000000001L};
    static int[] kartaParollari = {40_00, 50_00, 40_00, 70_00};
    static int[] kartaPullari = {1_000_000, 2_000_000, 3_000_000, 4_000_000};

    static char til = 'u';
//    'e' yoki 'u';

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
            long kiritiladiganKR = (new Scanner(System.in)).nextLong();
            boolean kartaTopildimi = false;
            for (int i = 0; i < kartalar.length; i++) {
                if (kiritiladiganKR == kartalar[i]) {
                    kartaTopildimi = true;
                    System.out.println("Karta parolini kirit");
                    int kiritiladiganKParol = (new Scanner(System.in)).nextInt();
                    boolean parolTogriKiritildimi = false;
                    for (int j = 0; j < kartaParollari.length; j++) {

                        if (kiritiladiganKParol == kartaParollari[j] && i == j ) {
                            while (true) {
                                menu();
                                int menuRaqami = (new Scanner(System.in)).nextInt();
                                menuIshlashi(menuRaqami);
                                if (menuRaqami == 5) break;
                            }

                            parolTogriKiritildimi = true;
                            break;

                        }
                    }
                    if (parolTogriKiritildimi == false) {
                        System.out.println("Parol xato kiritildi");
                    }

                }
            }
            if (kartaTopildimi == false) {
                System.out.println("Karta topilmadi");
            }


        }

    }

    static void menuIshlashi(int kMR) {
        switch (kMR) {
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

                System.out.println("Kartani oling");
                break;
            default:
        }
    }

    private static void valyuteAlmashtirish() {

    }

    private static void parolniOzgartirish() {

    }

    private static void naqdPulOlish() {

    }

    private static void balansniKorish() {

    }
    //todo meyhodlar tugatish, 5 - kartadan kartaga pul o'tkazish - 0.5 %


    static void menu() {
        System.out.println(til == 'e' ? MENU_MESSAGE_EN : MENU_MESSAGE);
    }
}

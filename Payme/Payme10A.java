package Payme;

import java.util.Random;
import java.util.Scanner;

import static Payme.PaymeConstants.*;

/**
 * User:t.me/supermatematikuz
 * Date:23.10.2023 11:10
 */
public class Payme10A {
    static long[] kartalar = {8600000000000000L, 9860000000000000L, 8600000000000001L, 9860000000000001L};
    static int[] kartaParollari = {40_00, 50_00, 40_00, 70_00};
    static int[] kartaPullari = {1_000_000, 2_000_000, 3_000_000, 4_000_000};
    static String[] users = {"+998901144223", "+998901111111", "+998333333333"};
    static String[] admins = {"+998901144224", "+998901111112", "+998333333334"};
    static String[] passwords = {"Nuriddin007", "Makaron012", "Kulibqo'ydim"};
    static String[] adminPasswords = {"Nuriddin007", "AdminMakaron012", "AdminAka"};
    static char til = EN;


    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Tilni tanlang, Choose language,Viberite yazik
                    1.English
                    2.Uzbek
                    3.Russkiy
                    """);
            int tanlanadiganTil = (new Scanner(System.in)).nextInt();
//            til = tanlanadiganTil == 1 ? EN
//                    : tanlanadiganTil == 2 ? UZ
//                    : tanlanadiganTil == 3 ? RU : ' ';
            if (tanlanadiganTil == 1) {
                til = EN;
            } else if (tanlanadiganTil == 2) {
                til = UZ;
            } else if (tanlanadiganTil == 3) {
                til = RU;
            } else {
                System.out.println("Xato kiritding,default uzbek tanlandi");
            }

            System.out.println(tanlanadiganTil == EN ? FIRST_MESSAGE_EN
                    : tanlanadiganTil == UZ ? FIRST_MESSAGE_UZ
                    : tanlanadiganTil == RU ? FIRST_MESSAGE_RU
                    : FIRST_MESSAGE_UZ);
            int kiritilganSon = (new Scanner(System.in).nextInt());
            switch (kiritilganSon) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                default:
                    System.out.println("");
            }
        }
    }

    private static void login() {
        System.out.println("Enter phone number");
        String enteredPN = (new Scanner(System.in).next());
        boolean isInUsersExist = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(enteredPN)) {
                isInUsersExist = true;
                System.out.println("Enter password");
                String enteredPassword = (new Scanner(System.in)).next();
                for (int j = 0; j < passwords.length; j++) {
                    if (enteredPassword.equals(passwords[j]) && i == j) {
                        showMenu(enteredPassword);
                    }
                }
            }
        }
        if (isInUsersExist == false) {
            for (int i = 0; i < admins.length; i++) {
                if (admins[i].equals(enteredPN)) {
                    isInUsersExist = true;
                    System.out.println("Enter password");
                    String enteredPassword = (new Scanner(System.in)).next();
                    for (int j = 0; j < adminPasswords.length; j++) {
                        if (enteredPassword.equals(adminPasswords[j]) && i == j) {
                            showMenuForAdmin(enteredPassword);
                        }
                    }
                }
            }
        }
        if (isInUsersExist == false) {
            System.out.println("No user");
        }

    }

    private static void showMenuForAdmin(String enteredPassword) {
        System.out.println("Admin menu");
    }

    private static void showMenu(String password) {
        System.out.println("User menu");
    }

    private static void register() {
        System.out.println("Enter phone number");
        String enteredPN = (new Scanner(System.in)).next();
        //todo royhattan otkan otmaganini tekshiramiz
        int sentCode = (int) (Math.random() * 10000);
        System.out.println("Bir martalik code " + sentCode);
        System.out.println("Kelgan kodni kiriting");
        int enteredCode = (new Scanner(System.in)).nextInt();
        if (enteredCode == sentCode) {
            //todo 2 talik password
        }

    }
}

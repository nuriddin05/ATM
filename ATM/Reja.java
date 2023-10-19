package ATM;

import java.util.Scanner;

public class Reja {
    public static final String MESSAGE_UZ = "Salom";
    public static final String MESSAGE_EN = "Hello";
    public static final String MESSAGE_RU = "Privet";
    static char til  = 'u';


    public static void main(String[] args) {
        System.out.println("""
                    Tilni tanlang, Choose language,Viberite yazik
                    1.English
                    2.Uzbek
                    3.Russkiy
                    """);
        char en = 'e';
        char uz = 'u';
        char ru = 'r';

        int tanlanganTil = (new Scanner(System.in)).nextInt();
        if (tanlanganTil == 1) {
            til = en;
        } else if (tanlanganTil == 3) {
            til = ru;
        } else {
            til = uz;
        }
//        til =
//                tanlanganTil == 1
//                        ? en
//                        : tanlanganTil == 3
//                        ? ru
//                        : uz;





        System.out.println(
                til == en ? MESSAGE_EN : til == ru ? MESSAGE_RU : MESSAGE_UZ
        );

    }
}

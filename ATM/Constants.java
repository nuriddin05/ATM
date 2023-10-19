package ATM;

public class Constants {
    public static final String FIRST_MESSAGE = "Karta raqamini kiriting, parolni kiriting!";
    public static final String FIRST_MESSAGE_EN = "Card entered, enter password!";
    public static final String MENU_MESSAGE = """
            1. Balansni ko'rish
            2. Naqd pul olish
            3. Parol o'zgartirish
            4. Valyuta almashtirish
            5. Chiqib ketish
            """;
    public static final String MENU_MESSAGE_EN = """
            1. View balance
            2. Cash withdrawal
            3. Change password
            4. Change currency
            5. Exit
            """;

    public static final String CURRENCY_MENU_UZ = """
            1. Dollar
            2. Evro
            3. Rubl
            0. Chiqish
            """;
    public static final String CURRENCY_MENU_EN = """
            1. Dollar
            2. Euro
            3. Russian Rubles
            0. Exit
            """;

    public static final int DOLLAR_KURSI = 12250;
    public static final int EVRO_KURSI = 13100;
    public static final int RUBL_KURSI = 12250;


}

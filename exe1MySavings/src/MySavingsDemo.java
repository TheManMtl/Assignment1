/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.util.Scanner;

public class MySavingsDemo {

    public static void main(String[] args) {

        char quitKey = '0';
        /*
        * init console menu
        * constructor: list of menu, quit key, chars to select the menu
        * */

        TerminalMenu menuObj = new TerminalMenu(getMenuList(), '0', getMenuListTriggers());
        PiggyBank piggyBankObj = new PiggyBank();
        Scanner sc = new Scanner(System.in);
        char inputKey;
        String inKey;
        do {
            menuObj.printMenuToConsole();
            menuObj.printMenuQuitCode(quitKey);
            menuObj.printMenuChoiceCode();

            inKey = sc.next();
            while (!menuObj.validateChoice(inKey)) {
                menuObj.printMenuChoiceError();
                inKey = sc.next();
            }
            inputKey = inKey.charAt(0);
            while (!menuObj.validateChoice(inputKey)) {
                menuObj.printMenuChoiceError();
                inputKey = sc.next().charAt(0);
            }
            switch (inputKey) {
                case '1':
                    System.out.printf("Total balance: %.2f\n",piggyBankObj.getBalance());
                    System.out.println("Enter any key to continue...");
                    sc.next();
                    break;
                case '2':
                    piggyBankObj.addPenny();
                    break;
                case '3':
                    piggyBankObj.addNickle();
                    break;
                case '4':
                    piggyBankObj.addDime();
                    break;
                case '5':
                    piggyBankObj.addQuarter();
                    break;
                case '6':
                    piggyBankObj.takeOutMoney();
                    break;
            }
        } while (inputKey != menuObj.getQuitKey());

        sc.close();
    }

    private static String[] getMenuList() {
        String[] menuList = {
                "Show total in bank.",
                "Add a penny.",
                "Add a nickle",
                "Add a dime.",
                "Add a quarter",
                "Take money out of bank."
        };
        return menuList;
    }

    private static char[] getMenuListTriggers() {
        char[] menuList = {
                '1',
                '2',
                '3',
                '4',
                '5',
                '6'
        };
        return menuList;
    }
}

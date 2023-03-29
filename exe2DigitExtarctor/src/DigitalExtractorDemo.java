/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.util.Scanner;

public class DigitalExtractorDemo {

    public static void main(String[] args) {
        char quitKey = 'Q';
        TerminalMenu menuObj = new TerminalMenu(getMenuList(), quitKey, getMenuListTriggers());
        Scanner sc = new Scanner(System.in);
        DigitalExtractor num = new DigitalExtractor();

        menuObj.printString("Enter an integer: ");
        num.setNum(sc.nextInt());
        //validating number to be between 0-999
        int count = num.getDigitCount();
        while (count > 3 || count < 0) {
            menuObj.printMenuChoiceError();
            num.setNum(sc.nextInt());
            count = num.getDigitCount();
        }

        char inputKey; // user input as char
        String inKey; // user input key as string
        do {
            //Preparing menu
            menuObj.printMenuToConsole();
            menuObj.printMenuQuitCode(quitKey);
            menuObj.printMenuChoiceCode();

            //validate if only one char entered
            inKey = sc.next();
            while (!menuObj.validateChoice(inKey)) {
                menuObj.printMenuChoiceError();
                inKey = sc.next();
            }
            //validate if the entered char is available
            inputKey = inKey.charAt(0);
            while (!menuObj.validateChoice(inputKey)) {
                menuObj.printMenuChoiceError();
                inputKey = sc.next().charAt(0);
            }

            switch (inputKey) {
                case 'W':
                    System.out.println("Whole number is: " + num.getNum());
                    break;
                case 'O':
                    System.out.println("The one's place digit is: " + num.getOnes());
                    break;
                case 'T':
                    System.out.println("The ten's place digit is: " + num.getTens());
                    break;
                case 'H':
                    System.out.println("The hundred's place digit is: " + num.getHundreds());
                    break;
            }
        } while (inputKey != menuObj.getQuitKey());

        sc.close();

      /*  System.out.println(num.getOnes(num.getNum()));
        System.out.println(num.getTens(num.getNum()));
        System.out.println(num.getHundreds(num.getNum()));*/

    }

    private static String[] getMenuList() {
        String[] menuList = {
                "show (W)hole number.",
                "show (O)nes pace number.",
                "show (T)ens place number",
                "show (H)undreds place number"
        };
        return menuList;
    }

    private static char[] getMenuListTriggers() {
        char[] menuList = {
                'W',
                'O',
                'T',
                'H',
        };
        return menuList;
    }
}

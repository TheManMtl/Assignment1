/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.util.Scanner;

public class AdderDemo {
    public static void main(String[] args) {
        int status;
        Adder adder = new Adder();
        Scanner reader = new Scanner(System.in);
        do{

        }while (adder.start(reader));

        reader.close();
        System.out.println(adder);
    }
}

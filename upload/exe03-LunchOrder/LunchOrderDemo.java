/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * 46m
 * */

import java.util.Scanner;

public class LunchOrderDemo {

    public static void main(String[] args) {
        //console reader
        Scanner reader = new Scanner(System.in);

        //hamburger init
        System.out.print("Enter number of hamburgers: ");
        float hamQuantity = reader.nextFloat();
        Food hamburger =
                new Food(1.85f, 9.0f, 33.0f, 1.0f);
        System.out.println("Each hamburger has " + hamburger.getFat() + "g of fat, "
                + hamburger.getCarbohydrate() + "g of carbs, and "
                + hamburger.getFiber() + "g of fiber.");
        System.out.println();

        //salad init
        System.out.print("Enter number of salads: ");
        float saladQuantity = reader.nextFloat();
        Food salad =
                new Food(2.0f, 1.0f, 11.0f, 5.0f);
        System.out.println("Each salad has " + salad.getFat() + "g of fat, "
                + salad.getCarbohydrate() + "g of carbs, and "
                + salad.getFiber() + "g of fiber.");
        System.out.println();

        //french fries init
        System.out.print("Enter number of french fries: ");
        float frenchFriesQuantity = reader.nextFloat();
        Food frenchFries =
                new Food(1.30f, 11.0f, 36.0f, 4.0f);
        System.out.println("French fries have " + frenchFries.getFat() + "g of fat, "
                + frenchFries.getCarbohydrate() + "g of carbs, and "
                + frenchFries.getFiber() + "g of fiber.");
        System.out.println();

        //soda init
        System.out.print("Enter number of soda: ");
        float sodaQuantity = reader.nextFloat();
        Food soda =
                new Food(0.95f, 0.0f, 38.0f, 0.0f);
        System.out.println("Each soda has " + soda.getFat() + "g of fat, "
                + soda.getCarbohydrate() + "g of carbs, and "
                + soda.getFiber() + "g of fiber.");
        System.out.println();
        reader.close();

        //order total price
        float orderPrice = (hamburger.getPrice() * hamQuantity)
                + (salad.getPrice() * saladQuantity)
                + (frenchFries.getPrice() * frenchFriesQuantity)
                + (soda.getPrice() * sodaQuantity);


        System.out.println("Your order comes to: $" + orderPrice);

    }


}

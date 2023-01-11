package day09_practices;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = input.next();

        input.nextLine();

        System.out.println("Enter the product name:");

        String product_name = input.nextLine();

        System.out.println("Enter the price:");

        double price = input.nextDouble();

        System.out.println("Enter the quantity");

        int quantity = input.nextInt();



        System.out.println(name + ", your order for "+ quantity+" "+ product_name + " has been placed. Your total is $"+ price);
    }
}
/*
7. Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

 */
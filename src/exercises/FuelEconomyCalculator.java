package exercises;

import java.util.Scanner;

public class FuelEconomyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextInt();
        System.out.println("How many gallons of gas have you consumed?");
        double gallons = input.nextInt();
        input.close();
        double mpg = miles / gallons;
        System.out.println("Your fuel economy is " + mpg + " miles per gallon.");
    }
}

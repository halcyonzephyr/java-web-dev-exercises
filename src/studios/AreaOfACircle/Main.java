package studios.AreaOfACircle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        String userInput = input.nextLine();
        double radius = -1;

        try {
            radius = Double.parseDouble(userInput);
            while (radius < 0) {
                System.out.println("Please enter a number greater than zero.");
                System.out.println("What is the radius of your circle?");
                userInput = input.nextLine();
                radius = Double.parseDouble(userInput);
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value");
            System.out.println("What is the radius of your circle?");
            userInput = input.nextLine();
        }

        double area = Circle.getArea(radius);
        System.out.println(area);


    }
}

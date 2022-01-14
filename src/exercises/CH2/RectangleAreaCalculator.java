package exercises.CH2;
import java.util.Scanner;
public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the rectangle's width?");
        int width = input.nextInt();
        System.out.println("What is the rectangle's length?");
        int length = input.nextInt();
        input.close();
        int area = length * width;
        System.out.println("The rectangle's area is " + area);
    }
}



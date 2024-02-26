package Day9;

import java.util.Scanner;

public class RectangleAreaDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rectangle's width: ");
        double rectWidth = scanner.nextDouble();
        System.out.print("Enter the rectangle's breadth: ");
        double rectBreadth = scanner.nextDouble();

        int rectArea = (int) (rectWidth * rectBreadth);
        System.out.println("The rectangle's area is: " + rectArea);
    }
}

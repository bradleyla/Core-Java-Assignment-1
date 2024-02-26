package Day9;

import java.util.Scanner;

class Average {

    public static void calcAverage(double firstNum, double secondNum, double thirdNum) {
        double average = (firstNum + secondNum + thirdNum) / 3.0;

        System.out.println("The average of these three numbers is: " + average);
    }

}

public class AverageDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNum = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNum = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double thirdNum = scanner.nextDouble();

        Average.calcAverage(firstNum, secondNum, thirdNum);
    }
}

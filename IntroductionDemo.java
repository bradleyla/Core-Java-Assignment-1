package Day9;

import java.util.Scanner;

public class IntroductionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your roll number: ");
        int rollNum = scanner.nextInt();
        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.next();

        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNum +
                ". My field of interest is " + fieldOfInterest + ".");
    }
}

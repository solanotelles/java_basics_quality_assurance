package week1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number:");
        double number1 = scan.nextDouble();

        System.out.println("Enter a second number:");
        double number2 = scan.nextDouble();

        double sum = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The sum is " + sum);
        System.out.println("The subtraction is " + subtraction);
        System.out.println("The multiplication is " + multiplication);

        if (number2 != 0) {
            System.out.printf("The division is %.2f", division);

        } else {
            System.out.println("The number 0 is not valid for division operation. Try again!");

        } scan.close();
    }
}

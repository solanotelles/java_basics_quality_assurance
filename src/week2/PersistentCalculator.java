package week2;

import java.util.Scanner;

public class PersistentCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        int operationOption;

        do {
            System.out.println("Enter the number of the desired operation:\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n0 - Exit");
            operationOption = scan.nextInt();

            switch (operationOption) {
                case 1:
                    System.out.println("Enter a number:");
                    num1 = scan.nextDouble();

                    System.out.println("Enter a second number:");
                    num2 = scan.nextDouble();

                    System.out.printf("The addition is: %.2f%n", add(num1, num2));
                    break;
                case 2:
                    System.out.println("Enter a number:");
                    num1 = scan.nextDouble();

                    System.out.println("Enter a second number:");
                    num2 = scan.nextDouble();

                    System.out.printf("The subtraction is: %.2f%n", subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Enter a number:");
                    num1 = scan.nextDouble();

                    System.out.println("Enter a second number:");
                    num2 = scan.nextDouble();

                    System.out.printf("The multiplication is: %.2f%n", multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Enter a number:");
                    num1 = scan.nextDouble();

                    System.out.println("Enter a second number:");
                    num2 = scan.nextDouble();

                    if (num2 == 0) {
                        System.out.println("The divisor can't be zero.");
                    } else {
                        System.out.printf("The division is: %.2f%n", divide(num1, num2));
                    }
                    break;
                case 0:
                    System.out.println("Thank you for using this program.");
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;

            }
        } while (operationOption != 0);
        scan.close();
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

}

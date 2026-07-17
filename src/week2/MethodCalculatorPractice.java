package week2;

import java.util.Scanner;

public class MethodCalculatorPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        double num1 = scan.nextDouble();

        System.out.println("Enter a second number:");
        double num2 = scan.nextDouble();

        System.out.println("Enter the number of the desired operation:\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
        int operationOption = scan.nextInt();

        operationMenu(operationOption, num1, num2);

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

    static void operationMenu(int option, double a, double b) {
        switch (option) {
            case 1:
                System.out.printf("The addition is: %.2f%n", add(a, b));
                break;
            case 2:
                System.out.printf("The subtraction is: %.2f%n", subtract(a, b));
                break;
            case 3:
                System.out.printf("The multiplication is: %.2f%n", multiply(a, b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("A number can't be divided by zero.");
                } else {
                    System.out.printf("The division is: %.2f%n", divide(a, b));
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

}


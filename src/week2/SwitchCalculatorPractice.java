package week2;

import java.util.Scanner;

public class SwitchCalculatorPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        double num1 = scan.nextDouble();

        System.out.println("Enter another number:");
        double num2 = scan.nextDouble();

        System.out.println("Enter the number of the desired operation:\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
        int operationOption = scan.nextInt();

        switch (operationOption) {
            case 1:
                System.out.printf("The addition is: %.2f%n", (num1 + num2));
                break;
            case 2:
                System.out.printf("The subtraction is: %.2f%n", (num1 - num2));
                break;
            case 3:
                System.out.printf("The multiplication is: %.2f%n", (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("A number can't be divided by zero.");
                } else {
                    System.out.printf("The division is: %.2f%n", (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operation");
        }

        scan.close();
    }
}

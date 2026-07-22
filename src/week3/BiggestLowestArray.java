package week3;

import java.util.Scanner;

public class BiggestLowestArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbers = new double[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the " + (i + 1) + "º number:");
            numbers[i] = scan.nextDouble();
        }

        double biggestNum = numbers[0], smallestNum = numbers[0], sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggestNum) {
                biggestNum = numbers[i];
            } else if (numbers[i] < smallestNum) {
                smallestNum = numbers[i];
            }
            sum += numbers[i];
        }
        System.out.printf("The biggest number is %.2f%n", biggestNum);
        System.out.printf("The smallest number is %.2f%n", smallestNum);
        System.out.printf("The sum is %.2f%n", sum);
        System.out.printf("The average is: %.2f%n", (sum / numbers.length));

        scan.close();
    }
}

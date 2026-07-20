package week2;

import java.util.Scanner;

public class CompliantVerification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of the analysed sample:");
        double valueAnalysed = scan.nextDouble();

        System.out.println("Enter the value of the maximum limit:");
        double maximumLimit = scan.nextDouble();

        compliantCheck(valueAnalysed, maximumLimit);

        scan.close();
    }

    static void compliantCheck(double valueAnalysed, double maximumLimit) {
        System.out.println("Value Analysed: " + valueAnalysed);
        System.out.println("Maximum Limit: " + maximumLimit);

        if (valueAnalysed > maximumLimit) {
            System.out.println("Result: Non Compliant");
        } else {
            System.out.println("Result: Compliant");
        }

    }
}

package week1;

import java.util.Scanner;

public class QualityAnalysisRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        String productName = "";
        double maximumMoistValue = 0, maximumDensValue = 0;

        System.out.println("Enter 1 for Dog Dog and Enter 2 for Rocky Dog");
        int optionProduct = scan.nextInt();
        while (i != 0) {
            if (optionProduct == 1 || optionProduct == 2) {
                if (optionProduct == 1) {
                    productName = "Dog Dog";
                    maximumMoistValue = 9.5;
                    maximumDensValue = 450;
                } else {
                    productName = "Rocky Dog";
                    maximumMoistValue = 8.5;
                    maximumDensValue = 400;
                }
                i = 0;
            } else {
                System.out.println("Invalid input");
                optionProduct = scan.nextInt();
            }
        }

        System.out.println("Enter the moisture value of the product:");
        double moistureValue = scan.nextDouble();
        while  (moistureValue <= 0 || moistureValue >= 30) {
            System.out.println("Invalid input. try again");
            moistureValue = scan.nextDouble();
        }

        System.out.println("Enter the density of the product:");
        int density = scan.nextInt();
        while  (density <= 0 || density >= 500) {
            System.out.println("Invalid input. try again");
            density = scan.nextInt();
        }

        System.out.println("Product Name: " + productName);

        if (moistureValue > maximumMoistValue) {
            System.out.printf("Moisture Value: %.2f%%. Compliant%n", moistureValue);
        } else {
            System.out.printf("Moisture Value: %.2f%%. Non-compliant%n", moistureValue);
        }

        if (density > maximumDensValue) {
            System.out.println("Density: " + density + " g/L. Compliant");
        } else {
            System.out.println("Density: " + density + " g/L. Non-compliant");;
        }
        scan.close();
    }
}


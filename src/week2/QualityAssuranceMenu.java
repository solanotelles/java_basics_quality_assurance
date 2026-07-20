package week2;

import java.util.Scanner;

public class QualityAssuranceMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int optionMenu;

        do {
            System.out.println("=== Quality Assurance Menu ===\n1 - Check Moisture\n2 - Check Density\n3 - Calculate Average\n0 - Exit");
            optionMenu = scan.nextInt();

            switch (optionMenu) {
                case 1:
                    System.out.println("Enter the moisture value:");
                    double moistureValue = scan.nextDouble();

                    System.out.println("Enter the maximum moisture value:");
                    double maximumMoistureValue = scan.nextDouble();

                    System.out.println("Moisture Value: " + moistureValue + "\nMaximum Moisture Value: " + maximumMoistureValue);
                    checkMoisture(moistureValue, maximumMoistureValue);
                    break;
                case 2:
                    System.out.println("Enter the density value:");
                    double densityValue = scan.nextDouble();

                    System.out.println("Enter the maximum density value:");
                    double maximumDensityValue = scan.nextDouble();

                    System.out.println("Density Value: " + densityValue + "\nMaximum Density Value: " + maximumDensityValue);
                    checkDensity(densityValue, maximumDensityValue);
                    break;
                case 3:
                    double sum = 0;
                    int avgCont;
                    do {
                        System.out.println("Enter the quantity of numbers you want the average (must be greater than 0): ");
                        avgCont = scan.nextInt();
                    } while (avgCont <= 0);

                    for (int i = 1; i <= avgCont; i++) {
                        System.out.println("Enter number " + i + ":");
                        double num = scan.nextDouble();
                        sum += num;
                    }
                    System.out.printf("The average is: %.2f%n", calculateAverage(sum, avgCont));
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (optionMenu != 0);
        scan.close();
    }


    static void checkMoisture(double moistureValue, double maximumMoistureValue) {
        if (moistureValue > maximumMoistureValue) {
            System.out.println("Result: Non Compliant");
        } else {
            System.out.println("Result: Compliant");
        }
    }

    static void checkDensity(double densityValue, double maximumDensityValue) {
        if (densityValue > maximumDensityValue) {
            System.out.println("Result: Non Compliant");
        } else {
            System.out.println("Result: Compliant");
        }
    }

    static double calculateAverage(double sum, int avgCont) {
        return sum / avgCont;
    }
}


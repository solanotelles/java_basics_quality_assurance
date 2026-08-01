package month1.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class QualityControlProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int optionMenu, densityValue, densityMaximum;
        String productName;
        double moistureValue, moistureMaximum;

        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Double> moistureResults = new ArrayList<>();
        ArrayList<Double> moistureMaximumStandards = new ArrayList<>();
        ArrayList<Integer> densityResults = new ArrayList<>();
        ArrayList<Integer> densityMaximumStandards = new ArrayList<>();

        do {
            System.out.println("=== Quality Control System ===\n1 - Register Analysis\n2 - List Analyses\n3 - Calculate Average Moisture\n4 - Check Analyses Outside the Standard\n5 - Exit");
            optionMenu = scan.nextInt();
            scan.nextLine();

            switch (optionMenu) {
                case 1:
                    System.out.println("Enter the product name:");
                    productName = scan.nextLine();
                    System.out.println("Enter the moisture value:");
                    moistureValue = scan.nextDouble();
                    System.out.println("Enter the maximum standard for moisture:");
                    moistureMaximum = scan.nextDouble();
                    System.out.println("Enter the density value:");
                    densityValue = scan.nextInt();
                    System.out.println("Enter the maximum standard for density:");
                    densityMaximum = scan.nextInt();
                    addAnalysis(productNames, moistureResults, moistureMaximumStandards, densityResults, densityMaximumStandards, productName, moistureValue, moistureMaximum, densityValue, densityMaximum);
                    break;
                case 2:
                    if (productNames.isEmpty()) {
                        System.out.println("No analyses have been registered");
                    } else {
                        listAnalyses(productNames, moistureResults, moistureMaximumStandards, densityResults, densityMaximumStandards);
                    }
                    break;
                case 3:
                    if (productNames.isEmpty()) {
                        System.out.println("No analyses have been registered");
                    } else {
                        System.out.printf("The moisture average is: %.2f%%%n", calculateMoistureAverage(moistureResults));
                    }
                    break;
                case 4:
                    if (productNames.isEmpty()) {
                        System.out.println("No analyses have been registered");
                    } else {
                        nonCompliantAnalysesCheck(productNames, moistureResults, moistureMaximumStandards, densityResults, densityMaximumStandards);
                    }
                    break;
                case 5:
                    System.out.println("End");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (optionMenu != 5);

        scan.close();
    }

    static void addAnalysis(ArrayList<String> productNames, ArrayList<Double> moistureResults, ArrayList<Double> moistureMaximumStandards, ArrayList<Integer> densityResults, ArrayList<Integer> densityMaximumStandards, String productName, double moistureValue, double moistureMaximum, int densityValue, int densityMaximum) {
        productNames.add(productName);
        moistureResults.add(moistureValue);
        moistureMaximumStandards.add(moistureMaximum);
        densityResults.add(densityValue);
        densityMaximumStandards.add(densityMaximum);

    }

    static void listAnalyses(ArrayList<String> productNames, ArrayList<Double> moistureResults, ArrayList<Double> moistureMaximumStandards, ArrayList<Integer> densityResults, ArrayList<Integer> densityMaximumStandards) {
        for (int i = 0; i < productNames.size(); i++) {
            System.out.println("Analysis " + (i + 1));
            System.out.println("Product: " + productNames.get(i));
            if (moistureResults.get(i) > moistureMaximumStandards.get(i)) {
                System.out.printf("Moisture: %.2f%% - Non-Compliant%n", moistureResults.get(i));
            } else {
                System.out.printf("Moisture: %.2f%% - Compliant%n", moistureResults.get(i));
            }
            if (densityResults.get(i) > densityMaximumStandards.get(i)) {
                System.out.println("Density: " + densityResults.get(i) + " g/L - Non-Compliant");
            } else {
                System.out.println("Density: " + densityResults.get(i) + " g/L - Compliant");
            }
        }
    }

    static double calculateMoistureAverage(ArrayList<Double> moistureResults) {
        double sum = 0;
        for (int i = 0; i < moistureResults.size(); i++) {
            sum += moistureResults.get(i);
        }
        return (sum / moistureResults.size());
    }

    static void nonCompliantAnalysesCheck(ArrayList<String> productNames, ArrayList<Double> moistureResults, ArrayList<Double> moistureMaximumStandards, ArrayList<Integer> densityResults, ArrayList<Integer> densityMaximumStandards) {
        boolean hasNonCompliantAnalyses = false;
        for (int i = 0; i < productNames.size(); i++) {
            if (moistureResults.get(i) > moistureMaximumStandards.get(i) || densityResults.get(i) > densityMaximumStandards.get(i)) {
                hasNonCompliantAnalyses = true;
                System.out.println("Analysis " + (i + 1));
                System.out.println("Product: " + productNames.get(i));
                if (moistureResults.get(i) > moistureMaximumStandards.get(i)) {
                    System.out.printf("Moisture: %.2f%% - Non-Compliant%n", moistureResults.get(i));
                } else {
                    System.out.printf("Moisture: %.2f%% - Compliant%n", moistureResults.get(i));
                }
                if (densityResults.get(i) > densityMaximumStandards.get(i)) {
                    System.out.println("Density: " + densityResults.get(i) + " g/L - Non-Compliant");
                } else {
                    System.out.println("Density: " + densityResults.get(i) + " g/L - Compliant");
                }
            }
        }
        if (!hasNonCompliantAnalyses) {
            System.out.println("No non-compliant analyses were found");
        }
    }
}
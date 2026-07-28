package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class QualityControlSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Double> moistureValues = new ArrayList<>();
        ArrayList<Integer> densityValues = new ArrayList<>();
        String productName;
        double moisture;
        int density, option;

        do {
            System.out.println("=== Quality Control System ===\n1 - Register analysis\n2 - List analyses\n0 - Exit");
            option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    do {
                        System.out.println("Enter product name:");
                        productName = scan.nextLine();
                    } while (productName.isEmpty());
                    System.out.println("Enter product moisture:");
                    moisture = scan.nextDouble();
                    System.out.println("Enter product density:");
                    density = scan.nextInt();
                    registerAnalysis(productNames, moistureValues, densityValues, productName, moisture, density);
                    break;
                case 2:
                    if (productNames.isEmpty()) {
                        System.out.println("No analyses have been added.");
                    } else {
                    listAnalyses(productNames, moistureValues, densityValues);
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 0);

        scan.close();
    }

    static void registerAnalysis(ArrayList<String> productNames, ArrayList<Double> moistureValues, ArrayList<Integer> densityValues, String productName, double moisture, int density) {
        productNames.add(productName);
        moistureValues.add(moisture);
        densityValues.add(density);
    }

    static void listAnalyses(ArrayList<String> productNames, ArrayList<Double> moistureValues, ArrayList<Integer> densityValues) {
        for (int i = 0; i < productNames.size(); i++) {
            System.out.println("Analysis " + (i + 1));
            System.out.println("Product: " + productNames.get(i) + "\nMoisture: " + moistureValues.get(i) + "%\nDensity: " + densityValues.get(i) + " g/L");
        }
    }
}

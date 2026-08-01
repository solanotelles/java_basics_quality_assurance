package month1.week3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> productNames = new ArrayList<>();
        int numberOption;
        String productName;

        System.out.println("Enter product name:");
        productName = scan.nextLine();
        addProduct(productNames, productName);

        do {
            System.out.println("Add another product? (1 - Yes / 0 - No)");
            numberOption = scan.nextInt();
            scan.nextLine();
            switch (numberOption) {
                case 1:
                    System.out.println("Enter product name:");
                    productName = scan.nextLine();
                    addProduct(productNames, productName);
                    break;
                case 0:
                    System.out.println("End");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (numberOption != 0);

        listProducts(productNames);

        scan.close();
    }
    static void addProduct(ArrayList<String> productNames, String productName) {
        productNames.add(productName);
    }
    static void listProducts(ArrayList<String> productNames) {
        for (int i = 0; i < productNames.size(); i++) {
            System.out.println(productNames.get(i));
        }
    }
}

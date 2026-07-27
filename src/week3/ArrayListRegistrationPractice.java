package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRegistrationPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOption;
        ArrayList<String> productNames = new ArrayList<>();

        System.out.println("Enter product name:");
        productNames.add(scan.nextLine());

        do {
            System.out.println("Add another product? (1 - Yes / 0 - No)");
            numberOption = scan.nextInt();
            scan.nextLine();
            switch (numberOption) {
                case 1:
                    System.out.println("Enter product name:");
                    productNames.add(scan.nextLine());
                    break;
                case 0:
                    System.out.println("End");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (numberOption != 0);

        for (int i = 0; i < productNames.size(); i++) {
            System.out.println("Product " + (i + 1) + ": " + productNames.get(i));
        }

        scan.close();
    }
}

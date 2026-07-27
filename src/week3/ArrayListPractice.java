package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> productNames = new ArrayList<>();
        System.out.println("Enter the names of three products");

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of the " + (i + 1) + "º product:");
            productNames.add(scan.nextLine());
        }

        for (int i = 0; i < productNames.size(); i++) {
            System.out.println("The product at index " + i + " is: " + productNames.get(i));

        }

        scan.close();
    }
}

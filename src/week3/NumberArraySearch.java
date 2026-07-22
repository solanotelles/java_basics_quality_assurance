package week3;

import java.util.Scanner;

public class NumberArraySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        boolean numberFound = false;
        int foundIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        System.out.println("Enter number to search: ");
        int numberToSearch = scan.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numberToSearch == numbers[i]) {
                numberFound = true;
                foundIndex = i;
            }
        }

        if (numberFound) {
            System.out.println("Number found in index " + foundIndex);
        } else {
            System.out.println("Number not found");
        }


        scan.close();
    }
}

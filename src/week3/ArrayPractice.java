package week3;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] integerNums = new int[5];

        for (int i = 0; i < integerNums.length; i++) {
            System.out.println("Enter the " + (i + 1) + "º number:");
            integerNums[i] = scan.nextInt();
        }

        System.out.println("You've entered the following numbers:");

        for (int i = 0; i < integerNums.length; i++) {
            System.out.println(integerNums[i]);
        }

        scan.close();
    }
}

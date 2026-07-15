package week1;

import java.util.Scanner;

public class EvenOddPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even");

        } else {
            System.out.println("The number is odd");
        }
        scan.close();
    }
}

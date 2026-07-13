package week1;

import java.util.Scanner;

public class MediaCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first grade:");
        double grade1 = scan.nextDouble();

        System.out.println("Enter your second grade:");
        double grade2 = scan.nextDouble();

        System.out.println("Enter your third grade:");
        double grade3 = scan.nextDouble();

        if (grade1 >= 0 && grade1 <= 10.0 && grade2 >= 0 && grade2 <= 10.0 && grade3 >= 0 && grade3 <= 10.0) {
            double gradeMedia = (grade1 + grade2 + grade3) / 3;

            if (gradeMedia >= 7.0) {
                System.out.println("Approved");
            } else if (gradeMedia >= 5.0) {
                System.out.println("Conditional pass");
            } else {
                System.out.println("Rejected");
            }

        } else {
            System.out.println("Incorrect grade!");
        }
        scan.close();
    }
}

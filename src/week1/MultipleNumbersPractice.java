package week1;

import java.util.Scanner;

public class MultipleNumbersPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0, newNum = 0, biggestNum = 0, lowestNum = 0;

        System.out.println("Enter the loop size: ");
        int loopSize = scan.nextInt();
            while (loopSize <= 0) {
                System.out.println("The loop size can't be 0 or less. Type another number");
                loopSize = scan.nextInt();
            }

        for (int i = 1; i <= loopSize; i++) {
            System.out.println("Enter a number: ");
            newNum = scan.nextDouble();
            if (i == 1) {
                biggestNum = newNum;
                lowestNum = newNum;
            }
            sum += newNum;
            if (newNum > biggestNum) {
                biggestNum = newNum;
            } else if (newNum < lowestNum) {
                lowestNum = newNum;
            }
        }

        System.out.println("You've entered " + loopSize + " numbers in the loop.");
        System.out.println("The biggest number is " + biggestNum);
        System.out.println("The lowest number is " + lowestNum);
        System.out.println("The sum is " + sum);
        System.out.printf("The average is %.2f%n", sum / loopSize);

        scan.close();
    }
}

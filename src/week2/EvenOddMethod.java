package week2;

import java.util.Scanner;

public class EvenOddMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        int num = scan.nextInt();

        String evenOddResult = evenOddCheck(num);
        System.out.println(evenOddResult);

        scan.close();
    }

    static String evenOddCheck(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}

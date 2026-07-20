package week2;

import java.util.Scanner;

public class PersistentMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an option in the menu below:");
        System.out.println("===Menu===\n1 - Say Hello\n2 - Check Even or Odd\n3 - Multiplication Table\n0 - Exit");

        int optionMenu = scan.nextInt();

        while (optionMenu != 0) {
            switch (optionMenu) {
                case 1:
                    System.out.println("Hello!");
                    break;

                case 2:
                    System.out.println("Enter an integer number:");
                    int numEvenOdd = scan.nextInt();

                    evenOddCheck(numEvenOdd);
                    break;

                case 3:
                    System.out.println("Enter an integer number for multiplication table:");
                    int numMultiplicationTable = scan.nextInt();

                    multiplicationTableCalculator(numMultiplicationTable);
                    break;

                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Enter an new option:");
            System.out.println("===Menu===\n1 - Say Hello\n2 - Check Even or Odd\n3 - Multiplication Table\n0 - Exit");
            optionMenu = scan.nextInt();
        }
        System.out.println("Exit");

        scan.close();
    }
    static void evenOddCheck(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    static void multiplicationTableCalculator(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

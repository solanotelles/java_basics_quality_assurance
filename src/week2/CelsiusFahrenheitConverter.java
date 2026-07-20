package week2;

import java.util.Scanner;

public class CelsiusFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int optionMenu;

        do {
            System.out.println("=== Menu ===\n1 - Celsius to Fahrenheit\n2 - Fahrenheit to Celsius\n0 - Exit");
            optionMenu = scan.nextInt();

            switch (optionMenu) {
                case 1:
                    System.out.println("Enter the value of Celsius:");
                    double celsius = scan.nextDouble();

                    System.out.printf("The fahrenheit value is %.2f%n", celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Enter the value of Fahrenheit:");
                    double fahrenheit = scan.nextDouble();

                    System.out.printf("The celsius value is %.2f%n", fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (optionMenu != 0);


        scan.close();
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}

package week1;

import java.util.Scanner;

public class RegistrationPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.nextLine();

        System.out.println("Enter your age:");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the name of the city you live:");
        String cityName = scan.nextLine();

        System.out.println("Registration Complete!\nHello, " + name + "!");
        System.out.println("You have " + age + " years old and live in " + cityName + ".");

        scan.close();
    }
}

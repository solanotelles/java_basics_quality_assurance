package week2;

import java.util.Scanner;

public class AgeVerificationMethodPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        boolean isAdult = checkAge(age);
        System.out.println(isAdult);

        scan.close();
    }

    static boolean checkAge(int age) {
        return age >= 18;
    }
}

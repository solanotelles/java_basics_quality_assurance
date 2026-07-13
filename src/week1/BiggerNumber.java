package week1;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int biggestNumber = 0;
        
        System.out.println("Enter three integer numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 == num2 && num2 == num3){
            System.out.println("All three integer numbers are equal");
        } else {
            if (num1 >= num2 && num1 > num3) {
                biggestNumber = num1;
            } else if (num2 > num1 && num2 >= num3) {
                biggestNumber = num2;
            } else {
                biggestNumber = num3;
            }
            System.out.println("The biggest number is: " + biggestNumber);
        }
        scan.close();
    }
}

package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        // Get the number of the hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int workdHours = scanner.nextInt();

        //Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double payRate = scanner.nextDouble();
        scanner.close();

        //Multiply hours and pay rate
        double grossPay = workdHours * payRate;

        //Display
        System.out.println("The employee's gross pay is: "  + grossPay);
    }
}

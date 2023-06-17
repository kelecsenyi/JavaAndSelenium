package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main(String args[]){
        int rate = 15;
        int maxWorkedHours = 40;

        System.out.println("How many hours did you work this week?");
        Scanner scn = new Scanner(System.in);
        double workedHours = scn.nextDouble();

        while(workedHours > maxWorkedHours || workedHours < 1){
            System.out.println("Invalid entry. Try again, it must be between 1 and 10.");
            workedHours = scn.nextDouble();
        }
        scn.close();
        double salary = rate * workedHours;
        System.out.println("Your salary is: "+salary);
    }
}

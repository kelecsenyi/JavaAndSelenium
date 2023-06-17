package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]){
        boolean isEnough;
        Scanner scn = new Scanner(System.in);
       do {
           System.out.println("Enter the first number: ");
           double firstNumber = scn.nextDouble();

           System.out.println("Enter the first number: ");
           double secondNumber = scn.nextDouble();

           double sum = firstNumber + secondNumber;
           System.out.println(sum);

           System.out.println("Would you like to start again?");
           isEnough = scn.nextBoolean();

       }while(isEnough);
       scn.close();
    }
}

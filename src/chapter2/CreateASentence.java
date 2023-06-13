package chapter2;

import java.util.Scanner;

public class CreateASentence {

    public static void main(String arg[]){
        // Create a sentences with the user answers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a season of the year: ");
        String seasonOfYear = scanner.next();

        System.out.println("Please give a whole number: ");
        int wholeNumber = scanner.nextInt();

        System.out.println("Please give an adjective: ");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " " + seasonOfYear + " day, I drink a minimum of " + wholeNumber + " cups of coffee." );
        scanner.close();
    }
}

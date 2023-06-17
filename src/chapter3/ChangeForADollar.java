package chapter3;

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        double filler = 0.10;
        double negyed = 0.25;
        int forint = 1;

        System.out.println("Enter how many fillers?");
        int numOfFiller = scr.nextInt();

        System.out.println("Enter how many negyeds?");
        int numOfFNegyed = scr.nextInt();

        scr.close();
        double total = numOfFiller * filler + numOfFNegyed * negyed;

        if(total < forint){
            double amountShort = forint - total;
            System.out.println("You lose! You were short " + amountShort + " fillers.");
        } else if (total>forint) {
            double amountOver = total - forint;
            System.out.println("You lose! You were over " + amountOver + " fillers.");
        }else{
            System.out.println("You won! Its exactly" + total);
        }
    }
}

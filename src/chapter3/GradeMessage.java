package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        System.out.println("Enter your letter grade: ");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        String message;
        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "great job";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "work harder";
                break;
            default:
                message ="error";
                break;
        }
        System.out.println(message);
        sc.close();
    }
}

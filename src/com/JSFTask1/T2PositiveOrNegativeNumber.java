package com.JSFTask1;
import  java.util.*;


public class T2PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        while(!validInput)
        {
            try {
                System.out.println("Enter the Number you want to check");
                int number = in.nextInt();
                validInput=true;
                if (number > 0) {
                    System.out.println(number + ": is a positive number");
                } else if (number < 0) {
                    System.out.println(number + ":is a negative number");
                } else if (number == 0) {
                    System.out.println(number + ": is a Neutral number");
                } else {
                    System.out.println("Invalid Input");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                in.nextLine();
            }
        }
        in.close();
    }
}

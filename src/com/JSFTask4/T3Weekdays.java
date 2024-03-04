package com.JSFTask4;

import java.util.Scanner;

public class T3Weekdays {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner in = new Scanner(System.in);
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Enter the day position (0-6): ");
                int dayPosition = in.nextInt();
                try {
                    String dayName = weekdays[dayPosition];
                    System.out.println("The day is: " + dayName);
                    isValidInput = true;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Day position must be between 0 and 6.");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input:" + e.getLocalizedMessage());
                in.nextLine();
            }

        }
        in.close();
    }
}

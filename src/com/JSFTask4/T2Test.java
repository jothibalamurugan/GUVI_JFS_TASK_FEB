package com.JSFTask4;

import java.util.Scanner;

public class T2Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isValidInput=false;
        while(!isValidInput)
        {
            try
            {
                System.out.print("Enter voter ID: ");
                int voterId = in.nextInt();
                in.nextLine(); // Consume newline
                System.out.print("Enter voter name: ");
                String name = in.nextLine();
                System.out.print("Enter voter age: ");
                int age = in.nextInt();
                try {
                    T2Voter voter = new T2Voter(voterId, name, age);
                    System.out.println("Voter created successfully!");
                    System.out.println(voter.toString());
                    isValidInput=true;
                } catch (T2InvalidAgeException e) {
                    System.out.println("Error: " + e.getMessage());
                }

            }
            catch (Exception e)
            {
                System.out.println("Invalid Input"+e.getLocalizedMessage());
                in.nextLine();
            }
        }
        in.close();

    }
}

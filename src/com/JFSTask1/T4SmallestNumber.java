package com.JFSTask1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T4SmallestNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        boolean isValidInput=false;
        while (!isValidInput)
        {
            try
            {
                System.out.println("Enter the first number");
                double num1=in.nextDouble();
                System.out.println("Enter the second number");
                double num2=in.nextDouble();
                System.out.println("Enter the third number");
                double num3=in.nextDouble();
                double smallest=num1;
                if(num2<smallest)
                {
                    smallest=num2;
                }
                if(num3<smallest)
                {
                    smallest=num3;
                }
                if (num1 == num2 && num2 == num3)
                {
                    System.out.println("All three numbers are equal: " + num1);
                } else if (num1 == num2 || num1 == num3 || num2 == num3)
                {
                    System.out.println("Two or more numbers are equal and smallest: " + smallest);
                } else {
                    System.out.println("The smallest number among three is :"+smallest);
                }
        isValidInput=true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid Input");
                in.nextLine();
            }
        }
        in.close();
    }
}

package com.JSFTask1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T3ReverseNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean isValidInput=false;
        while(!isValidInput)
        {
            try
            {
                System.out.println("Enter the number to be reversed");
                int number=in.nextInt();
                System.out.println("Input :"+number);
                int reminder=0;
                int result=0;
               while(number>0)
               {
                   reminder=number%10;
                   result=result*10+reminder;
                   number/=10;
               }
                System.out.println("output:"+result);
                isValidInput=true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input please enter a valid number");
                in.nextLine();
            }
        }
        in.close();
    }
}

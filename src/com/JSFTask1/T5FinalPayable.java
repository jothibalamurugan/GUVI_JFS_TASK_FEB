package com.JSFTask1;

import java.util.Scanner;

public class T5FinalPayable {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        boolean isValidInput=false;
        while(!isValidInput)
        {
            try
            {
                System.out.println("Enter the Purchased Amount");
                double purchaseAmount=in.nextDouble();
                double finalPayableAmount=0;
                if (purchaseAmount < 500) {
                    finalPayableAmount = purchaseAmount;
                } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
                    finalPayableAmount = purchaseAmount*0.9;
                } else {
                    finalPayableAmount = purchaseAmount*0.8;
                }
                System.out.println("Final Payable Amount: Rs." + finalPayableAmount);
                System.out.println("Discount Amount: Rs." + (purchaseAmount-finalPayableAmount));
        isValidInput=true;
            }
            catch (Exception e)
            {
                System.out.println("Invalid Input");
                in.nextLine();
            }
        }
        in.close();
    }
}

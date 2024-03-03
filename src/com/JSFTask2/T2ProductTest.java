package com.JSFTask2;

import java.util.Scanner;

public class T2ProductTest {
    public static void main(String[] args) {
        T2Product[] productInformation=new T2Product[5];
        Scanner in=new Scanner(System.in);
        boolean isValidInput=false;
        while(!isValidInput) {
            try {
                for (int i = 0; i < productInformation.length; i++) {
                    productInformation[i]=new T2Product();
                    System.out.print("Enter the product Id:");
                    int id =in.nextInt();
                    productInformation[i].setPid(id);
                    System.out.print("Enter the Price of the product:");
                    double price=in.nextDouble();
                    productInformation[i].setPrice(price);
                    System.out.print("Enter the quantity of the Product:");
                    int product=in.nextInt();
                    productInformation[i].setQuantity(product);
                    isValidInput=true;
                }

                T2Product highestValuePid =productInformation[0];
                for (int j = 0; j < productInformation.length ; j++) {
                    if(productInformation[j].getPrice()>highestValuePid.getPrice())
                    {
                        highestValuePid=productInformation[j];
                    }
                }

                System.out.println("--------------------------");
                System.out.println("Highest value Product Id is :"+highestValuePid.getPid());
                System.out.println("Highest value Product Price is :"+highestValuePid.getPrice());
                System.out.println("Highest value Product quantity is :"+highestValuePid.getQuantity());
                System.out.println("--------------------------");
                System.out.println("TotalAmountSpent:"+totalAmountSpent(productInformation));

            } catch (Exception e)
            {
                System.out.println("Invalid Input"+e.getLocalizedMessage());
                in.nextLine();
            }
        }

    }

    public static double totalAmountSpent(T2Product productList[])
    {
        double finalAmount=0;
        double temp=0;
        for (int k = 0; k <productList.length ; k++) {
            temp= productList[k].getPrice() * productList[k].getQuantity();
            finalAmount=finalAmount+temp;
        }
        return  finalAmount;
    }
}

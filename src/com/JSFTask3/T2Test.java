package com.JSFTask3;

import java.util.Scanner;

public class T2Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isValidInput=false;
        while(!isValidInput)
        {
            try
            {
                System.out.println("Enter Employee Information:");
                System.out.print("Employee ID: ");
                String empid = in.nextLine();
                System.out.print("Employee Name: ");
                String name = in.nextLine();
                System.out.print("Employee Salary: ");
                double salary = in.nextDouble();

                T2Employee emp = new T2Employee(empid, name, salary);
                double incomeTax = emp.calcTax();
                System.out.println("Income Tax for " + empid + ": " + incomeTax);
                in.nextLine();

                System.out.println("\nEnter Product Information:");
                System.out.print("Product ID: ");
                String pid = in.nextLine();
                System.out.print("Product Price: ");
                double price = in.nextDouble();
                System.out.print("Product Quantity: ");
                int quantity = in.nextInt();

                T2Product prod = new T2Product(pid, price, quantity);
                double salesTax = prod.calcTax();
                System.out.println("Sales Tax for Product " + pid + ": " + salesTax);

                isValidInput=true;
            }
            catch (Exception e)
            {
                System.out.println("Invalid Input:"+e.getLocalizedMessage());
            }
        }
        in.close();
    }
}

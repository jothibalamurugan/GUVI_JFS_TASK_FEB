package com.JSFTask3;

public class T2Employee implements T2Taxable{
    private String empid;
    private String name;
    private double salary;
    private double interestRate = 0.105;
    public T2Employee(String empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        return salary * interestRate;
    }
}

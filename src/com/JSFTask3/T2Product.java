package com.JSFTask3;

public class T2Product implements T2Taxable {
    private String pid;
    private double price;
    private int quantity;
    private  double salesTaxRate = 0.07;

    public T2Product(String pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public double calcTax() {
        return price * salesTaxRate;
    }
}
package com.JSFTask2;

public class T2Product {
    private int pid;
    private  double price;
    private int quantity;
    public T2Product() {

    }

    public T2Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

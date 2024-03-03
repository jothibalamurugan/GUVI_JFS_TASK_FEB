package com.JSFTask2;

public class T1Person {
    private String name;
    private int age;
    public T1Person() {
        this.age = 18;
    }
    public T1Person(String name) {
        this.name = name;
        this.age = 18;
    }
    public T1Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("------------");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        T1Person person1 = new T1Person("jothibalamurugan");
        T1Person person2 = new T1Person("Guvi", 25);
        T1Person person3 = new T1Person();
        person1.display();
        person2.display();
        person3.setName("Balamurugan");
        person3.display();




    }
}

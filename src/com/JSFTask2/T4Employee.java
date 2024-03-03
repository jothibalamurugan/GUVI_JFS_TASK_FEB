package com.JSFTask2;

public class T4Employee extends  T1Person{
    private String employeeId="";
    private double salary=0;

    public T4Employee()
    {
        super();
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public double getSalary() {
        return salary;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("EmployeeId: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("------------");
    }

    public static void main(String[] args) {
        T4Employee e1=new T4Employee();
        e1.setName("Jothibalamurugan");
        e1.setAge(28);
        e1.setEmployeeId("13904");
        e1.setSalary(45000);
        e1.display();
    }
}

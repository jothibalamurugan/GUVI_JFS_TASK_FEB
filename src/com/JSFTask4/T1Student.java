package com.JSFTask4;

public class T1Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public T1Student(int rollNo, String name, int age, String course) throws T1AgeNotWithinRangeException, T1NameNotValidException {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;

        if (!(age >= 15 && age <= 21)) {
            throw new T1AgeNotWithinRangeException("Age should be between 15 and 21.");
        }

        if (!name.matches("[a-zA-Z ]+")) {
            throw new T1NameNotValidException("Name should not contain numbers or special symbols.");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + rollNo +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Course='" + course + '\'' +
                '}';
    }
}

package com.JSFTask4;

public class T1Test {
    public static void main(String[] args)  {
        try {

            T1Student student1 = new T1Student(1, "JohnDoe", 18, "Computer Science");
            System.out.println("Student created successfully!:"+student1.toString());

            T1Student student2 = new T1Student(2, "Alice Smith", 25, "Physics");
            System.out.println("Student created successfully!:"+student2.toString());
        } catch (T1AgeNotWithinRangeException | T1NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

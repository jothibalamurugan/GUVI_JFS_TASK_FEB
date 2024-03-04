package com.JSFTask4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T4StudentGradeSystem {
        private Map<String, Integer> gradeMap;

        public T4StudentGradeSystem() {
            gradeMap = new HashMap<>();
        }
        public void addStudent(String name, int grade) {
            gradeMap.put(name.toUpperCase(), grade);
        }

        public void removeStudent(String name) {
            gradeMap.remove(name.toUpperCase());
        }

        public void displayGrade(String name) {
            Integer grade = gradeMap.get(name.toUpperCase());
            if (grade != null) {
                System.out.println("Grade of " + name + ": " + grade);
            } else {
                System.out.println("Student '" + name + "' not found.");
            }
        }
        public static void main(String[] args) {
            T4StudentGradeSystem gradeSystem = new T4StudentGradeSystem();
            Scanner in = new Scanner(System.in);
            boolean isValidInput=false;
            while(!isValidInput)
            {
                try
                {
                    while (true) {
                        System.out.println("\nMenu:");
                        System.out.println("1. Add Student");
                        System.out.println("2. Remove Student");
                        System.out.println("3. Display Student Grade");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice: ");
                        int choice = in.nextInt();
                        in.nextLine();
                        isValidInput=true;
                        switch (choice) {
                            case 1:
                                System.out.print("Enter student name: ");
                                String newStudentName = in.nextLine().toUpperCase();
                                System.out.print("Enter student grade: ");
                                int newStudentGrade = in.nextInt();
                                gradeSystem.addStudent(newStudentName, newStudentGrade);
                                System.out.println("Student added successfully.");
                                break;
                            case 2:
                                System.out.print("Enter student name to remove: ");
                                String studentToRemove = in.nextLine().toUpperCase();
                                gradeSystem.removeStudent(studentToRemove);
                                System.out.println("Student removed successfully.");
                                break;
                            case 3:
                                System.out.print("Enter student name to display grade: ");
                                String studentToDisplay = in.nextLine().toUpperCase();
                                gradeSystem.displayGrade(studentToDisplay);
                                break;
                            case 4:
                                System.out.println("Exiting program.");
                                return;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        }
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input:"+e.getLocalizedMessage());
                    in.nextLine();
                }
            }

        }
    }



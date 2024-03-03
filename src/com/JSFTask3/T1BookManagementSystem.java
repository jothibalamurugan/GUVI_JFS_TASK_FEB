package com.JSFTask3;

import java.util.Scanner;

public class T1BookManagementSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        T1Library library = new T1Library(5);
        boolean isValidInput = false;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");

            while (!isValidInput) {
                try {
                    System.out.print("Enter your choice: ");
                    int choice = in.nextInt();
                    in.nextLine();
                    isValidInput = true;
                    switch (choice) {
                        case 1:
                            System.out.print("Enter Book ID: ");
                            int bookId = in.nextInt();
                            in.nextLine();
                            System.out.print("Enter Title: ");
                            String title = in.nextLine();
                            System.out.print("Enter Author: ");
                            String author = in.nextLine();
                            T1Book newBook = new T1Book(bookId, title, author);
                            library.addBook(newBook);
                            break;
                        case 2:
                            System.out.print("Enter Book ID to remove: ");
                            int removeId = in.nextInt();
                            library.removeBook(removeId);
                            break;
                        case 3:
                            System.out.print("Enter Book ID to search: ");
                            int searchId = in.nextInt();
                            library.searchBookById(searchId);
                            break;
                        case 4:
                            library.displayAllBooks();
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Input: " + e.getMessage());
                    in.nextLine();
                }
            }
            isValidInput = false;
        }
    }
}

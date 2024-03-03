package com.JSFTask3;

public class T1Library {
    private T1Book[] books;
    private int maxSize;
    private int currentSize;


    public T1Library(int maxSize) {
        this.maxSize = maxSize;
        this.books = new T1Book[maxSize];
        this.currentSize = 0;
    }

    // Method to add a book
    public void addBook(T1Book book) {
        if (currentSize < maxSize) {
            books[currentSize++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to remove a book by ID
    public void removeBook(int bookId) {
        for (int i = 0; i < currentSize; i++) {
            if (books[i].getBookId() == bookId) {
                books[i] = null;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Method to search for a book by ID
    public void searchBookById(int bookId) {
        for (int i = 0; i < currentSize; i++) {
            if (books[i].getBookId() == bookId) {
                books[i].displayDetails();
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < currentSize; i++) {
            books[i].displayDetails();
            System.out.println("-------------------------");
        }
    }
}



//Library Management System 


import java.util.ArrayList;
import java.util.Scanner;

// Book class to represent a book in the library
class Book {
    String title;
    boolean isBorrowed;

    // Constructor to initialize a book with a title
    public Book(String title) {
        this.title = title;
        this.isBorrowed = false; // Initially, the book is available
    }
}

// Main class for the Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // List to store books in the library
        ArrayList<Book> books = new ArrayList<>();
        
        // Adding some books to the library
        books.add(new Book("Java Programming"));
        books.add(new Book("Data Structures"));
        books.add(new Book("Operating Systems"));

        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Menu-driven system for user interaction
        while (true) {
            // Display menu options
            System.out.println("\nLibrary Management System");
            System.out.println("1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Display the list of books with availability status
                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i + 1) + ". " + books.get(i).title + 
                            (books.get(i).isBorrowed ? " (Borrowed)" : " (Avai


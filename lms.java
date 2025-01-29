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

    // Method to borrow a book
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("You have returned: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
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
                            (books.get(i).isBorrowed ? " (Borrowed)" : " (Available)"));
                    }
                    break;

                case 2:
                    // Borrow a book
                    System.out.print("\nEnter the book number to borrow: ");
                    int borrowIndex = scanner.nextInt() - 1;
                    if (borrowIndex >= 0 && borrowIndex < books.size()) {
                        books.get(borrowIndex).borrowBook();
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 3:
                    // Return a book
                    System.out.print("\nEnter the book number to return: ");
                    int returnIndex = scanner.nextInt() - 1;
                    if (returnIndex >= 0 && returnIndex < books.size()) {
                        books.get(returnIndex).returnBook();
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

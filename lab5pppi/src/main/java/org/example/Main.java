package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static class Book {
        private String title;
        private String author;
        private int year;
        private boolean isAvailable;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.isAvailable = true;
        }


        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
        }


        public void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Year: " + year);
            System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        }
    }


    public static class Library {
        private ArrayList<Book> books;


    public Library() {
            books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book added: " + book.getTitle());
        }

        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books in the library.");
            } else {
                for (Book book : books) {
                    book.displayInfo();
                    System.out.println();
                }
            }
        }

        public Book searchBookByTitle(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            }
            return null;
        }

        public boolean borrowBook(String title) {
            Book book = searchBookByTitle(title);
            if (book != null && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("You borrowed: " + book.getTitle());
                return true;
            } else {
                System.out.println("Book is not available.");
                return false;
            }
        }

        public boolean returnBook(String title) {
            Book book = searchBookByTitle(title);
            if (book != null && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("You returned: " + book.getTitle());
                return true;
            } else {
                System.out.println("Book was not borrowed.");
                return false;
            }
        }
    }


    public static class User {
        private String name;
        private int borrowedBooksCount;

        // Конструктор
        public User(String name) {
            this.name = name;
            this.borrowedBooksCount = 0;
        }

        // Геттери і сеттери
        public String getName() {
            return name;
        }

        public int getBorrowedBooksCount() {
            return borrowedBooksCount;
        }

        public void setBorrowedBooksCount(int borrowedBooksCount) {
            this.borrowedBooksCount = borrowedBooksCount;
        }

        // Метод для відображення інформації про користувача
        public void displayUserInfo() {
            // Реалізація буде додана іншим учасником
        }
    }


    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Очищення буфера

            switch (choice) {
                case 1:
                    // Додавання книги (реалізація буде додана іншим учасником)
                    break;
                case 2:
                    // Відображення книг (реалізація буде додана іншим учасником)
                    break;
                case 3:
                    // Пошук книги (реалізація буде додана іншим учасником)
                    break;
                case 4:
                    // Видача книги (реалізація буде додана іншим учасником)
                    break;
                case 5:
                    // Повернення книги (реалізація буде додана іншим учасником)
                    break;
                case 6:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}

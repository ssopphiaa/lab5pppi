package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static class Book {
        private String title;
        private String author;
        private int year;
        private boolean isAvailable;

        // Конструктор
        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.isAvailable = true;  // За замовчуванням книга доступна
        }

        // Геттери і сеттери
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

        // Метод для відображення інформації про книгу (реалізує учасник команди)
        public void displayInfo() {
            // Реалізація буде додана іншим учасником
        }
    }


    public static class Library {
        private ArrayList<Book> books;

        // Конструктор
    public Library() {
            books = new ArrayList<>();
        }

        // Метод для додавання книги до бібліотеки
        public void addBook(Book book) {
            // Реалізація буде додана іншим учасником
        }

        // Метод для відображення всіх книг у бібліотеці
        public void displayBooks() {
            // Реалізація буде додана іншим учасником
        }

        // Метод для пошуку книги за назвою
        public Book searchBookByTitle(String title) {
            // Реалізація буде додана іншим учасником
            return null;
        }

        // Метод для видачі книги користувачу
        public boolean borrowBook(String title) {
            // Реалізація буде додана іншим учасником
            return false;
        }

        // Метод для повернення книги до бібліотеки
        public boolean returnBook(String title) {
            // Реалізація буде додана іншим учасником
            return false;
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

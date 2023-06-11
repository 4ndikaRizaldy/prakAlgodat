package algodat.p2;

import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;
    private int year;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
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

    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}

class Stack {
    private Book[] books;
    private int top;
    private int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        books = new Book[maxSize];
        top = -1;
    }

    public void push(Book book) {
        if (!isFull()) {
            books[++top] = book;
            System.out.println("Book pushed: " + book.getTitle());
        } else {
            System.out.println("Stack is full. Book cannot be pushed.");
        }
    }

    public Book pop() {
        if (!isEmpty()) {
            Book book = books[top];
            top--;
            System.out.println("Book popped: " + book.getTitle());
            return book;
        } else {
            System.out.println("Stack is empty. No book to pop.");
            return null;
        }
    }

    public Book peek() {
        if (!isEmpty()) {
            Book book = books[top];
            System.out.println("Top book: " + book.getTitle());
            return book;
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public void print() {
        System.out.println("Stack contents:");
        for (int i = top; i >= 0; i--) {
            System.out.println(books[i]);
        }
    }

    public int checkSize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

public class BookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxSize = 5;

        Stack bookStore = new Stack(maxSize);

        boolean repeat = true;
        while (repeat) {
            System.out.println("\nBook Store Menu:");
            System.out.println("1. Push a Book");
            System.out.println("2. Pop a Book");
            System.out.println("3. Peek the Top Book");
            System.out.println("4. Print Stack Contents");
            System.out.println("5. Check Stack Size");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = input.nextInt();
                    input.nextLine(); 
                    System.out.print("Enter Book Title: ");
                    String title = input.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = input.nextLine();
                    System.out.print("Enter Year of Publication: ");
                    int year = input.nextInt();
                    Book book = new Book(id, title, author, year);
                    bookStore.push(book);
                    break;
                case 2:
                    Book poppedBook = bookStore.pop();
                    if (poppedBook != null) {
                        System.out.println("Popped Book Details: " + poppedBook);
                    }
                    break;
                case 3:
                    Book topBook = bookStore.peek();
                    if (topBook != null) {
                        System.out.println("Top Book Details: " + topBook);
                    }
                    break;
                case 4:
                    bookStore.print();
                    break;
                case 5:
                    System.out.println("Stack Size: " + bookStore.checkSize());
                    break;
                case 6:
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        System.out.println("Exiting Book Stack program.");
    }
}
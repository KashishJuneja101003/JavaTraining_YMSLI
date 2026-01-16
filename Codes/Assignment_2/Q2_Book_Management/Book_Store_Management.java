package Assignment_2.Q2_Book_Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NegativeNumOfCopies extends RuntimeException {

    public NegativeNumOfCopies(String errorMessage) {
        super(errorMessage);
    }
}

class Book {

    private final String bookTitle;
    private final String author;
    private final String isbn;
    private int numOfCopies;

    public Book(String isbn, String author, String bookTitle, int numOfCopies) {
        this.isbn = isbn;
        this.author = author;
        this.bookTitle = bookTitle;

        if (numOfCopies < 0) {
            throw new NegativeNumOfCopies("Number of copies can't be negative");
        }
        this.numOfCopies = numOfCopies;
    }

    public void display() {
        System.out.println("\nBook Info:...");
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Number of copies: " + numOfCopies);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        if (numOfCopies < 0) {
            throw new NegativeNumOfCopies("Copies cannot be negative");
        }
        this.numOfCopies = numOfCopies;
    }

}

class BookStore {

    private final List<Book> books = new ArrayList<>();

    public void printBooks() {
        System.out.println("Printing Inventory: ");
        int num = 1;
        for (Book book : books) {
            System.out.println("Book " + num++);
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Book Title: " + book.getBookTitle());
            System.out.println("Number of copies: " + book.getNumOfCopies());
        }
    }

    private int findBookByTitle(String title) {
        Book book;
        int size = books.size();
        for (int i = 0; i < size; i++) {
            book = books.get(i);
            if (book.getBookTitle().equals(title)) {
                return i;
            }
        }

        return -1;
    }

    private int findBookByIsbn(String isbn) {
        Book book;
        int size = books.size();
        for (int i = 0; i < size; i++) {
            book = books.get(i);
            if (book.getIsbn().equals(isbn)) {
                return i;
            }
        }

        return -1;
    }

    public void sell(String title, int count) {
        if (count <= 0) {
            System.out.println("Invalid sell count");
            return;
        }

        int index = findBookByTitle(title);
        if (index == -1) {
            System.out.println("Book not found");
            return;
        }

        Book book = books.get(index);
        if (book.getNumOfCopies() < count) {
            System.out.println("Not enough stock");
            return;
        }

        book.setNumOfCopies(book.getNumOfCopies() - count);
    }

    public void order(String isbn, int count) {
        if (count < 0) {
            throw new NegativeNumOfCopies("Number of copies can't be negative.");
        }

        int index = findBookByIsbn(isbn);

        if (index == -1) {
            if (books.size() == 10) {
                System.out.println("Enough books. Can't add more.");
                return;
            }

            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Author: ");
                String author = sc.nextLine();

                Book newBook = new Book(isbn, author, title, count);
                addBook(newBook);
                System.out.println("Added book\n\n");
            } catch (Exception e) {
                System.out.println("Exception Occurred: " + e);
            }
        } else {
            Book book = books.get(index);
            book.setNumOfCopies(book.getNumOfCopies() + count);
        }
    }

    public void addBook(Book book) {
        if (books.size() > 10) {
            System.out.println("Enough Books");
            return;
        }

        books.add(book);
    }
}

public class Book_Store_Management {

    public static void main(String[] args) {
        try {
            BookStore bookStore = new BookStore();

            // Adding Books
            Book book1 = new Book("SN124", "A1", "BT1", 5);
            bookStore.addBook(book1);
            bookStore.printBooks();

            Book book2 = new Book("SN128", "A2", "BT2", 15);
            bookStore.addBook(book2);
            bookStore.printBooks();

            Book book3 = new Book("SN154", "A3", "BT3", 25);
            bookStore.addBook(book3);
            bookStore.printBooks();

            // Ordering Books
            bookStore.order("SN124", 10);
            bookStore.printBooks();
            
            bookStore.order("SN156", 110);
            bookStore.printBooks();


            // Selling Books
            bookStore.sell("BT3", -1);
            bookStore.printBooks();
            
            bookStore.sell("BT3", 10);
            bookStore.printBooks();
            
            bookStore.sell("BT3", 101);
            bookStore.printBooks();
        } catch (NegativeNumOfCopies e) {
            System.out.println(e);
        }
    }
}

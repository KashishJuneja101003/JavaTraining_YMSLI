package Assignment_3_Q4;

import java.util.LinkedList;

public class BookCollection {
	private LinkedList<Book> books;

	public BookCollection() {
		this.books = new LinkedList<>();
	}

	public void addBook(Book b) {
		books.add(b);
	}

	public Book searchBookById(int id) {
		for (Book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	public Book searchBookByIsbn(String isbn) {
		for (Book book : books) {
			if (book.getIsbn().equals(isbn)) {
				return book;
			}
		}
		return null;
	}

	public void sellBook(Book b, int numOfCopies) {
		for (Book book : books) {
			if (book.getIsbn() == b.getIsbn()) {
				if (book.getNumOfCopies() - numOfCopies >= 0) {
					book.setNumOfCopies(book.getNumOfCopies() - numOfCopies);
				} else {
					System.out.println("That much number of books is not available");
				}
				break;
			}
		}
	}
	
	public void purchaseBook(Book b, int numOfCopies) {
		for (Book book : books) {
			if (book.getIsbn() == b.getIsbn()) {
				book.setNumOfCopies(book.getNumOfCopies() + numOfCopies);
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "BookCollection [books=" + books + "]";
	}

}

package Assignment_4_Q2;

import java.util.Arrays;
import java.util.Comparator;

public class BookCollection {
	private String ownerName;
	private Book books[];
	
	public BookCollection(String oName, Book[] b) {
		this.ownerName = oName;
		this.books = b;
	}
	
	public boolean hasBook(Book b) {
		for(Book book : books) {
			if(book.equals(b)) {
				return true;
			}
		}
		return false;
	}

	public void sort() {
		Arrays.sort(books, 
				Comparator.comparing(Book::getTitle)
				.thenComparing(Book::getAuthor));
		;
	}

	@Override
	public String toString() {
		return "BookCollection:\nOwner: " + ownerName + "\nBooks:\n" + Arrays.toString(books);
	}
}

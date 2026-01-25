package Assignment_3_Q4;

import java.util.Objects;

public class Book {
	private int id;
	private String isbn;
	private String title;
	private String author;
	private int price;
	private int numOfCopies;
	
	public Book() {}
	
	public Book(int id, String isbn, String title, String author, int price, int numOfCopies) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.numOfCopies = numOfCopies;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, isbn, numOfCopies, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(isbn, other.isbn)
				&& numOfCopies == other.numOfCopies && price == other.price && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book: [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", numOfCopies=" + numOfCopies + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
}

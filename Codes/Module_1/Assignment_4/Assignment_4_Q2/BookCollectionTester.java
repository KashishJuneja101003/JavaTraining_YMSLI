package Assignment_4_Q2;

public class BookCollectionTester {
	public static void main(String[] args) {
		Book b1 = new Book("Head First", "Kerry");
		Book b2 = new Book("Core Java", "Blouch");
		Book b3 = new Book("Harry Potter", "J.K Rowling");
		
		Book books[] = {b1, b2, b3};
		
		BookCollection bc = new BookCollection("Kashish", books);
		
		System.out.println(bc);
	}
}

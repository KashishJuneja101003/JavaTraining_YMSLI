package Assignment_3_Q4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class BookApp {

	public static void main(String[] args) {
		BookCollection bc = new BookCollection();
		
//		Adding Books
		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\VE00YN351\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\Training\\src\\Assignment_3_Q4\\BooksData"))) {
			
			String line = br.readLine();
			
			while((line = br.readLine()) != null) {
				String[] words = line.split(":");
				
				Book book = new Book(
						Integer.parseInt(words[0]), 
						words[1], 
						words[2], 
						words[3], 
						Integer.parseInt(words[4]),
						Integer.parseInt(words[5])
				);
				
				bc.addBook(book);
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		
		System.out.println(bc);
		
		System.out.println("\n\nSearching Book:");
		Book bookSearch = bc.searchBookById(121);
		if(bookSearch != null) {
			System.out.println("Found " + bookSearch);
		} else {
			System.out.println("Book Not Found");
		}
		
		
		System.out.println("\n\nSelling Book:");
		Book bookSell= bc.searchBookByIsbn("A234");
		if(bookSell != null) {
			int numOfCopies = 20;
			bc.sellBook(bookSell, numOfCopies);
			System.out.println(numOfCopies + " copies of " + bookSell + " sold.");
		} else {
			System.out.println("Book Not Found");
		}

		
		System.out.println("\n\nPurchase Book:");
		Book bookPurchase= bc.searchBookByIsbn("A234");
		if(bookPurchase != null) {
			int numOfCopies = 120;
			bc.purchaseBook(bookPurchase, numOfCopies);
			System.out.println(numOfCopies + " copies of " + bookPurchase+ " purchased.");
		} else {
			System.out.println("Book Not Found");
		}
	}

}

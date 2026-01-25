package com.assignment_3_jpa_crud.client;

import java.util.List;
import java.util.Scanner;

import com.assignment_3_jpa_crud.entity.Book;
import com.assignment_3_jpa_crud.service.BookService;
import com.assignment_3_jpa_crud.service.BookServiceImpl;

public class BookApp {

	public static void main(String[] args) {
		BookService bs = new BookServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n=== Book Management ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Book by ISBN");
            System.out.println("3. View All Books");
            System.out.println("4. Remove Book");
            System.out.println("0. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
			case 1:
				System.out.print("ISBN: ");
	            String isbn = sc.next();
	            
	            System.out.print("Author: ");
	            String author = sc.next();
	            
	            System.out.print("Title: ");
	            String title = sc.next();
	            
	            System.out.print("Price: ");
	            Double price = sc.nextDouble();
	            
				bs.addBook(isbn, title, author, price);
				
				System.out.println("Book added successfully...");
				break;
				
			case 2:
				System.out.print("ISBN: ");
	            System.out.println(bs.getBookByIsbn(sc.next()));
	            break;
			case 3:
				List<Book> books =  bs.getAllBooks();
				System.out.println(books);
				break;
			
			case 4:
				System.out.print("ISBN: ");
				bs.removeBookByIsbn(sc.next());
				System.out.println("Book Removed Successfully...");
				break;
			
			case 0:
				return;
				
			default:
				System.out.println("Don't be oversmart. Enter valid choice...");
				break;
			}
		}
	}
}



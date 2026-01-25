package com.bookapp.controller;

import java.util.List;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoJdbcImpl;
import com.bookapp.dto.Book;

public class BookStoreController {

	public static void main(String[] args) {
		BookDao bookDao = new BookDaoJdbcImpl();
		List<Book> books = bookDao.getAllBooks();
		
		for (Book book : books) {
			System.out.println(book);
		}
		
		Book newBook = bookDao.addBook(new Book(11, "isbn-1010", "Days of my life", "Kashish Juneja", 10000000.0));
			
		for (Book book : books) {
			System.out.println(book);
		}
		
		Book searchedBookByIsbn = bookDao.getBookByIsbn("isbn-1010");
		System.out.print("Book you are searching for ISBN: "); 
		if(searchedBookByIsbn == null) {
			System.out.println("does not exists.");
		} else {
			System.out.println(searchedBookByIsbn);
		}
		
		Book searchedBookById = bookDao.getBookById(1);
		System.out.print("Book you are searching for ID: "); 
		if(searchedBookById == null) {
			System.out.println("does not exists.");
		} else {
			System.out.println(searchedBookById);
		}
		
		bookDao.deleteBook(1);
		System.out.print("Deleting Book..."); 
		
		Book updateBook = new Book("NB1", "KJ", "FSoG", 110000);
		bookDao.updateBook(11, updateBook);
	}
	

}

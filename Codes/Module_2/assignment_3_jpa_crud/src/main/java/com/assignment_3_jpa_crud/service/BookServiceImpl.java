package com.assignment_3_jpa_crud.service;

import java.util.List;

import com.assignment_3_jpa_crud.dao.BookDao;
import com.assignment_3_jpa_crud.dao.BookDaoImpl;
import com.assignment_3_jpa_crud.entity.Book;
import com.assignment_3_jpa_crud.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class BookServiceImpl implements BookService {

	private final BookDao bookDao = new BookDaoImpl();
		
	@Override
	public void addBook(String isbn, String title, String author, Double price) {
		if(isbn == null) {
			throw new IllegalArgumentException("ISBN cannot be empty");
		}
		
		if(price <= 0) {
			throw new IllegalArgumentException("Price must be positive");
		}
		
		if(bookDao.getBookByIsbn(isbn) != null) {
			throw new IllegalStateException("Book with same ISBN already exists");
		}
		
		Book book = new Book(isbn, title, author, price);
		bookDao.addBook(book);
	}

	@Override
	public Book getBookByIsbn(String isbn) {
		return bookDao.getBookByIsbn(isbn);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public void removeBookByIsbn(String isbn) {
		bookDao.deleteBookByIsbn(isbn);
	}

}

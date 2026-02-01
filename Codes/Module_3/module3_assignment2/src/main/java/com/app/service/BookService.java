package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.dto.BookDto;
import com.app.entity.Book;
import com.app.repo.BookRepository;

@Service
public class BookService {
	private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Book addBook(BookDto dto) {
    	Book book = new Book();
    	book.setTitle(dto.getTitle());
    	book.setAuthor(dto.getAuthor());
    	book.setPrice(dto.getPrice());
    	
    	return repo.save(book);
    }
    
    public Book updateBook(Integer id, BookDto dto) {
    	Book oldBook = repo.findById(id);
    	
    	if(oldBook == null) {
    		return null;
    	}
    	
    	oldBook.setAuthor(dto.getAuthor());
    	oldBook.setPrice(dto.getPrice());
    	oldBook.setTitle(dto.getTitle());
    	
    	return repo.save(oldBook);
    }
    
    public Book getBook(Integer id) {
    	return repo.findById(id);
    }
    
    public List<Book> getAllBooks() {
    	return repo.findAll();
    }
    
    public void deleteBook(Integer id) {
    	repo.deleteById(id);
    }
}

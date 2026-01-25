package Module_2.Module2_assignment_3.src.main.java.com.assignment_3_jpa_crud.service;

import java.util.List;

import com.assignment_3_jpa_crud.entity.Book;

public interface BookService {
	void addBook(String isbn, String title, String author, Double price);
	
	Book getBookByIsbn(String isbn);
	
	List<Book> getAllBooks();
	
	void removeBookByIsbn(String isbn);
}

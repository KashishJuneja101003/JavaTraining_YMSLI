package Module_2.Module2_assignment_3.src.main.java.com.assignment_3_jpa_crud.dao;

import java.util.List;

import com.assignment_3_jpa_crud.entity.Book;

public interface BookDao {
	public void addBook(Book book);

	public void deleteBook(Book book);
	
	public void deleteBookByIsbn(String isbn);
	
	public Book getBookById(int id);

	public Book getBookByIsbn(String isbn);
	
	public List<Book> getAllBooks(); 
}

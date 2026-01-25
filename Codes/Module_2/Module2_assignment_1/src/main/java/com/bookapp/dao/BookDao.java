package com.bookapp.dao;

import java.util.List;

import com.bookapp.dto.Book;

public interface BookDao {

    public List<Book> getAllBooks();

    public Book addBook(Book book);

    public Book getBookByIsbn(String isbn);
    
    public void deleteBook(int id);

    public void updateBook(int id, Book book);

    public Book getBookById(int id);
}
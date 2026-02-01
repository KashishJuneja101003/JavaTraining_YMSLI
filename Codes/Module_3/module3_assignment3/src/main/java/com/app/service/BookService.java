package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.Book;
import com.app.repo.BookRepository;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    // ✅ CREATE
    public Book addBook(Book book) {
        return repo.save(book);
    }

    // ✅ READ ALL
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    // ✅ READ BY ID
    public Book getBook(Integer id) {
        return repo.findById(id).orElse(null);
    }

    // ✅ DELETE
    public void deleteBook(Integer id) {
        repo.deleteById(id);
    }

    // 🔍 SEARCH METHODS
    public List<Book> getByAuthor(String author) {
        return repo.findByAuthor(author);
    }

    public List<Book> getByCategory(String category) {
        return repo.findByCategory(category);
    }

    public List<Book> getByPriceLessThan(Double price) {
        return repo.findByPriceLessThan(price);
    }

    public List<Book> searchByTitle(String keyword) {
        return repo.findByTitleContains(keyword);
    }

    public List<Book> getByPriceRange(double min, double max) {
        return repo.findByPriceBetween(min, max);
    }
}

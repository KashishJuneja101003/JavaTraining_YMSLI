package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.dto.Book;
import com.bookapp.util.ConnectionFactory;

public class BookDaoJdbcImpl implements BookDao {
	private Connection connection;

	public BookDaoJdbcImpl() {
		connection = ConnectionFactory.getConnection();
		if (connection == null) {
			throw new RuntimeException("Database connection failed");
		}
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>();

		String sql = "SELECT id, isbn, title, author, price FROM books";

		try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				Book book = new Book(rs.getInt("id"), rs.getString("isbn"), rs.getString("title"),
						rs.getString("author"), rs.getDouble("price"));
				books.add(book);
			}

		} catch (SQLException e) {
			throw new RuntimeException("Failed to fetch books", e);
		}

		return books;
	}

	@Override
	public Book addBook(Book book) {
		try {
			PreparedStatement pstmt = connection
					.prepareStatement("Insert into books(id, isbn, title, author, price) values(?, ?, ?, ?, ?)");
			pstmt.setInt(1, book.getId());
			pstmt.setString(2, book.getIsbn());
			pstmt.setString(3, book.getTitle());
			pstmt.setString(4, book.getAuthor());
			pstmt.setDouble(5, book.getPrice());
			pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return book;
	}

	@Override
	public Book getBookByIsbn(String isbn) {
		String sql = "Select * from books where isbn = ?";
		Book book = null;
		try (PreparedStatement pst = connection.prepareStatement(sql)) {
			pst.setString(1, isbn);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				book = new Book(rs.getInt("id"), rs.getString("isbn"), rs.getString("title"), rs.getString("author"),
						rs.getDouble("price"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	@Override
	public Book getBookById(int id) {
		String sql = "Select * from books where id = ?";
		Book book = null;
		try (PreparedStatement pst = connection.prepareStatement(sql)) {
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public void deleteBook(int id) {
		String sql = "Delete From books where id = ?";
		try (PreparedStatement pst = connection.prepareStatement(sql)) {
			pst.setInt(1, id);

			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBook(int id, Book newBook) {
		String sql = "UPDATE books SET isbn=?, title=?, author=?, price=? WHERE id=?";
		try (PreparedStatement pst = connection.prepareStatement(sql)) {
			pst.setString(1, newBook.getIsbn());
			pst.setString(2, newBook.getTitle());
			pst.setString(3, newBook.getAuthor());
			pst.setDouble(4, newBook.getPrice());
			pst.setInt(5, id);

			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package com.assignment_3_jpa_crud.dao;

import java.util.List;

import com.assignment_3_jpa_crud.entity.Book;
import com.assignment_3_jpa_crud.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class BookDaoImpl implements BookDao {

	@Override
	public void addBook(Book book) {
		EntityManager em = JpaUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			;
			em.persist(book);
			em.getTransaction().commit();
		} finally {
			em.close();
		}

	}

	@Override
	public void deleteBook(Book book) {
		try (EntityManager em = JpaUtil.getEntityManager()) {
			em.getTransaction().begin();
			em.remove(book);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Book getBookById(int id) {
		Book book = null;
		try (EntityManager em = JpaUtil.getEntityManager()) {
			book = em.find(Book.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	@Override
	public Book getBookByIsbn(String isbn) {
		Book book = null;

		try (EntityManager em = JpaUtil.getEntityManager()) {
			TypedQuery<Book> query = em.createQuery("Select b from Book b Where b.isbn = :isbn", Book.class);
			query.setParameter("isbn", isbn);
			book = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = null;
		try (EntityManager em = JpaUtil.getEntityManager()) {
			TypedQuery<Book> query = em.createQuery("Select b from Book b", Book.class);
			books = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public void deleteBookByIsbn(String isbn) {
		try (EntityManager em = JpaUtil.getEntityManager()) {
			em.getTransaction().begin();

			TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b Where b.isbn = :isbn", Book.class);
			query.setParameter("isbn", isbn);
			
			Book book = query.getSingleResult();
			
			if(book != null) {				
				em.remove(book);
			}

			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

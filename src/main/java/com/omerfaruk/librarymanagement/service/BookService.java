package com.omerfaruk.librarymanagement.service;

import com.omerfaruk.librarymanagement.entity.Book;
import com.omerfaruk.librarymanagement.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> getAll() {
        return repo.findAll();
    }

    public Book add(Book book) {
        book.setAvailable(true);
        return repo.save(book);
    }

    public Book borrow(Long id) {
        Book book = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        if (!book.isAvailable()) {
            throw new RuntimeException("Book is already borrowed");
        }

        book.setAvailable(false);
        return repo.save(book);
    }

    public Book returnBook(Long id) {
        Book book = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        if (book.isAvailable()) {
            throw new RuntimeException("Book is already available");
        }

        book.setAvailable(true);
        return repo.save(book);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

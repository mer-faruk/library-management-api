package com.omerfaruk.librarymanagement.controller;

import com.omerfaruk.librarymanagement.entity.Book;
import com.omerfaruk.librarymanagement.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAll() { 
        return service.getAll();
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return service.add(book);
    }

    @PutMapping("/{id}/borrow")
    public Book borrow(@PathVariable Long id) {
        return service.borrow(id);
    }

    @PutMapping("/{id}/return")
    public Book returnBook(@PathVariable Long id) {
        return service.returnBook(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}





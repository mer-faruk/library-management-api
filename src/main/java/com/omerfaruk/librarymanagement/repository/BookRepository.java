package com.omerfaruk.librarymanagement.repository;

import com.omerfaruk.librarymanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}


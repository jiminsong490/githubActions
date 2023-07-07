package com.techeer.gasession.domain.book.repository;

import com.techeer.gasession.domain.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
    Book findBookById(Long id);
}

package com.techeer.gasession.domain.book.service;

import com.techeer.gasession.domain.book.entity.Book;
import com.techeer.gasession.domain.book.repository.BookRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class BookService {
    private final BookRepository bookRepository;

    public Book findBookInfo(Long id) {
        Book book = bookRepository.findBookById(id);
        return book;
    }


}

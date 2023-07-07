package com.techeer.gasession.domain.book.controller;

import com.techeer.gasession.domain.book.entity.Book;
import com.techeer.gasession.domain.book.service.BookService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/books")
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@RestController
public class BookController {
    private final BookService bookService;

    @GetMapping("/{bid}")
    public ResponseEntity<String> searchTitle(@PathVariable Long bid) {
        Book book = bookService.findBookInfo(bid);
        return ResponseEntity.ok(book.getTitle());
    }
}

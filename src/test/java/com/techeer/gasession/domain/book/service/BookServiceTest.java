package com.techeer.gasession.domain.book.service;

import com.techeer.gasession.domain.book.entity.Book;
import com.techeer.gasession.domain.book.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    @InjectMocks
    private BookService bookService;
    @Mock
    private BookRepository bookRepository;

    @Test
    void findBookInfo() {
        Book book = Book.builder()
                .title("Github Actions 완전정복")
                .author("김작가")
                .publisher("테커")
                .build();

        given(bookRepository.findBookById(any())).willReturn(book);
        Mockito.lenient().when(bookService.findBookInfo(any())).thenReturn(book);
        assertThat(book.getTitle()).isEqualTo("Github Actions 완전정복");
    }
}
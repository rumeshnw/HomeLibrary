package dev.rumesh.homelibrary.web.controller;

import dev.rumesh.homelibrary.domain.Book;
import dev.rumesh.homelibrary.service.BookService;
import dev.rumesh.homelibrary.web.dto.BookDto;
import dev.rumesh.homelibrary.web.mapper.BookMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/books")
@Slf4j
public class BookController {

    private final BookService bookService;
    private final BookMapper bookMapper;

    public BookController(BookService bookService, BookMapper bookMapper) {
        this.bookService = bookService;
        this.bookMapper = bookMapper;
    }

    @GetMapping("")
    public List<BookDto> getAllBooks(){
        log.info("Loading all books");
        List<Book> books = bookService.getAllBooks();
        return books.stream().map(bookMapper::toDto).toList();
    }
}

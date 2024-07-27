package com.codebygaurav.graphql.service.Impl;

import com.codebygaurav.graphql.entities.Book;
import com.codebygaurav.graphql.repository.BookRepository;
import com.codebygaurav.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book getSingleBook(int bookId) {
        return this.bookRepository.findById(bookId).orElseThrow(()-> new RuntimeException("Book not found"));
    }
}

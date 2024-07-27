package com.codebygaurav.graphql.controller;

import com.codebygaurav.graphql.entities.Book;
import com.codebygaurav.graphql.entities.BookInput;
import com.codebygaurav.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //create
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setAuthor((book.getAuthor()));
        b.setDescription(book.getDescription());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());
        return this.bookService.create(b);
    }

    //getAll
    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

    //getSingleBook
    @QueryMapping("getBookById")
    public Book getSingleBook(@Argument int bookId){
        return this.bookService.getSingleBook(bookId);
    }
}


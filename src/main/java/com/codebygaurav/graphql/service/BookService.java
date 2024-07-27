package com.codebygaurav.graphql.service;

import com.codebygaurav.graphql.entities.Book;

import java.util.List;

public interface BookService {

    //create
    Book create(Book book);

    //get
    List<Book> getAll();

    //getSingleBook
    Book getSingleBook(int bookId);
}

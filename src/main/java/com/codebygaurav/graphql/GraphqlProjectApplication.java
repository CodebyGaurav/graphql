package com.codebygaurav.graphql;

import com.codebygaurav.graphql.entities.Book;
import com.codebygaurav.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		book.setTitle("Java Complete Reference");
		book.setAuthor("James Gosling	");
		book.setDescription("For Java Learning");
		book.setPages(1000);
		book.setPrice(500.0);

		Book book1 = new Book();
		book1.setTitle("Head First Java Complete Reference");
		book1.setAuthor("Head First");
		book1.setDescription("For Beginner Java Learning");
		book1.setPages(2000);
		book1.setPrice(1000.0);

		this.bookService.create(book);
		this.bookService.create(book1);
	}
}

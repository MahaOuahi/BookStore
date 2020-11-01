package org.maha.springbootstarter.books;

import java.util.List;
import java.util.Optional;

import org.maha.springbootstarter.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories/{categoryId}")
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getAllBooks(@PathVariable String categoryId) {
		return bookService.getAllBooks(categoryId);
	}
	
	@GetMapping("/books/{id}")
	public Optional<Book> getBook(@PathVariable String id) {
		return bookService.getBook(id);
	}
	
	@PostMapping("/books")
	public void addBook(@RequestBody Book book, @PathVariable String categoryId) {
		book.setCategory(new Category(categoryId, "", ""));
		bookService.addBook(book);
	}
	
	@PutMapping("/books/{id}")
	public void updateBook(@RequestBody Book book, @PathVariable String categoryId, @PathVariable String id) {
		book.setCategory(new Category(categoryId, "", ""));
		bookService.updateBook(book);
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable String id) {
		bookService.deleteBook(id);
	}
}

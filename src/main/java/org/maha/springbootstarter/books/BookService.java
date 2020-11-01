package org.maha.springbootstarter.books;

import java.util.ArrayList;	
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	
	public List<Book> getAllBooks(String categoryId){
		List<Book> books = new ArrayList<>();
		bookRepository.findByCategoryId(categoryId).forEach(books::add);
		return books;
	}
	
	public Optional<Book> getBook(String id) {
		return bookRepository.findById(id);
	}

	public void addBook(Book book) {
		bookRepository.save(book);
	}

	public void updateBook(Book book) {
		bookRepository.save(book);
	}

	public void deleteBook(String id) {
		bookRepository.deleteById(id);
	}
	
}

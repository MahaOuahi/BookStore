package org.maha.springbootstarter.books;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {
	
	public List<Book> findByCategoryId(String categoryId);

}

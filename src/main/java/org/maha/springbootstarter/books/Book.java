package org.maha.springbootstarter.books;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.maha.springbootstarter.category.Category;

@Entity
public class Book {
	
	@Id
	public String id;
	private String name;
	private String author;
	@ManyToOne
	private Category category;
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	public Book() {
			
	}
	
	public Book(String id, String name, String author, String categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.category = new Category(categoryId, "", "");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}

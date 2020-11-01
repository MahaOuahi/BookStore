package org.maha.springbootstarter.category;

import java.util.List;
import java.util.Optional;

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
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}
	
	@GetMapping("/{id}")
	public Optional<Category> getCategory(@PathVariable String id) {
		return categoryService.getCategory(id);
	}
	
	@PostMapping
	public void addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
	}
	
	@PutMapping("/{id}")
	public void updateCategory(@RequestBody Category category, @PathVariable String id) {
		categoryService.updateCategory(id, category);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable String id) {
		categoryService.deleteCategory(id);
	}
}

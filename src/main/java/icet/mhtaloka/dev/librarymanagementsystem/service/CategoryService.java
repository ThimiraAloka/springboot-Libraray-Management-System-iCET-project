package icet.mhtaloka.dev.librarymanagementsystem.service;

import java.util.List;

import icet.mhtaloka.dev.librarymanagementsystem.entity.Category;

public interface CategoryService {

	public List<Category> findAllCategories();

	public Category findCategoryById(Long id);

	public void createCategory(Category category);

	public void updateCategory(Category category);

	public void deleteCategory(Long id);

}

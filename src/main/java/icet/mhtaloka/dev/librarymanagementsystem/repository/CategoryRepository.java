package icet.mhtaloka.dev.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import icet.mhtaloka.dev.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

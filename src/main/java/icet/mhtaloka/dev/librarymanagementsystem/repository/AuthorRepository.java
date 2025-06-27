package icet.mhtaloka.dev.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import icet.mhtaloka.dev.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}

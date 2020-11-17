package in.pk.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.pk.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookCategories" ,path="book-Category")
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long>{

}

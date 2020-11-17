package in.pk.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pk.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}

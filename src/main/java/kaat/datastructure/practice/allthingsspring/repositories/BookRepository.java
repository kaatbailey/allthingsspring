package kaat.datastructure.practice.allthingsspring.repositories;

import kaat.datastructure.practice.allthingsspring.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

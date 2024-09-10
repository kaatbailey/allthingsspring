package kaat.datastructure.practice.allthingsspring.repositories;

import kaat.datastructure.practice.allthingsspring.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

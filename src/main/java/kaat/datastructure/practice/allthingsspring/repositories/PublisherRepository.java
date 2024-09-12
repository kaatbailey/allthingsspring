package kaat.datastructure.practice.allthingsspring.repositories;

import kaat.datastructure.practice.allthingsspring.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
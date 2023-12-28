package com.iffat.springboot.webapp.repositories;

import com.iffat.springboot.webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

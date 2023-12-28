package com.iffat.springboot.webapp.repositories;

import com.iffat.springboot.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

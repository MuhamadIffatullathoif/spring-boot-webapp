package com.iffat.springboot.webapp.repositories;

import com.iffat.springboot.webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

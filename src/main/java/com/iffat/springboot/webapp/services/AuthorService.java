package com.iffat.springboot.webapp.services;

import com.iffat.springboot.webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}

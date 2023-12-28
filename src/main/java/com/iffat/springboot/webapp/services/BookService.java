package com.iffat.springboot.webapp.services;

import com.iffat.springboot.webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}

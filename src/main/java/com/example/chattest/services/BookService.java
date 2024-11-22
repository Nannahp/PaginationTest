package com.example.chattest.services;

import com.example.chattest.models.Book;
import com.example.chattest.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService {
@Autowired
    private BookRepository bookRepository;

public Page<Book> getAllBooks(Pageable pageable) {
    return bookRepository.findAll(pageable);
}


}

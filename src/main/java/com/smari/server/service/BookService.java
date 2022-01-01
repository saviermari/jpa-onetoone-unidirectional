package com.smari.server.service;

import com.smari.server.dto.BookModel;

import java.util.List;

/**
 * @author smari
 */
public interface BookService {
    public BookModel createBook(BookModel model);
    public BookModel updateBook(BookModel model);
    public void deleteBook(Long id);
    public BookModel getBook(Long id);
    public List<BookModel> getAllBooks();
}

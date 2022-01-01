package com.smari.server.service;

import com.smari.server.dao.BookRepository;
import com.smari.server.dto.BookModel;
import com.smari.server.entity.Book;
import com.smari.server.mapper.BookMapper;
import com.smari.server.mapper.ShipmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author smari
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository repository;

    @Override
    public BookModel createBook(BookModel model) {
        Book entity = new Book();
        if (model != null) {
            entity.setName(model.getName());
            entity.setIsbn(model.getIsbn());
            entity.setShipping(ShipmentMapper.convertModelToEntity(model.getShipping()));
        }
        return BookMapper.convertEntityToModel(repository.save(entity));
    }

    @Override
    public BookModel updateBook(BookModel model) {
        return BookMapper.convertEntityToModel(repository.save(BookMapper.convertModelToEntity(model)));
    }

    @Override
    public void deleteBook(Long id) {
        repository.deleteById(id);
    }

    @Override
    public BookModel getBook(Long id) {
        Optional<Book> entity = repository.findById(id);
        if(entity.isPresent()) {
            return BookMapper.convertEntityToModel(entity.get());
        }
        return null;
    }

    @Override
    public List<BookModel> getAllBooks() {
        List<Book> products = repository.findAll();
        List<BookModel>  BookModels = products.stream().map(BookMapper::convertEntityToModel).collect(Collectors.toList());
        return BookModels;
    }
}

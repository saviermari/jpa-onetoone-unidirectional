package com.smari.server.mapper;

import com.smari.server.dto.BookModel;
import com.smari.server.entity.Book;

/**
 * Mapper utility for converting DTO to entity and entity to DTO
 * @author smari
 */
public class BookMapper {
    public static BookModel convertEntityToModel(Book entity){
        BookModel bookModel = new BookModel();
        if(entity != null){
            if(entity.getId() != null) bookModel.setId(entity.getId());
            bookModel.setName(entity.getName());
            bookModel.setIsbn(entity.getIsbn());
            bookModel.setShipping(ShipmentMapper.convertEntityToModel(entity.getShipping()));
        }
        return bookModel;
    }

    public static Book convertModelToEntity(BookModel model){
        Book book = new Book();
        if(model != null){
            if(model.getId() != null) book.setId(model.getId());
            book.setName(model.getName());
            book.setIsbn(model.getIsbn());
            book.setShipping(ShipmentMapper.convertModelToEntity(model.getShipping()));
        }
        return book;
    }
}

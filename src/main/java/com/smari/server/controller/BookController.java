package com.smari.server.controller;

import com.smari.server.dto.BookModel;
import com.smari.server.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * CRUD endpoints for Book Entitity with shipment association
 * @author smari
 */
@RestController
@RequestMapping(value = "/rest/v1", produces = { MediaType.APPLICATION_JSON_VALUE })
public class BookController {
        @Autowired
        private BookService service;

        @PostMapping("/books")
        public BookModel createBook(@RequestBody BookModel model){
            return service.createBook(model);
        }

        @PutMapping("/books/{id}")
        public BookModel updateBook(@RequestBody BookModel model, @PathVariable Long id){
            BookModel book = service.getBook(id);
            if(book == null){
                throw new RuntimeException("Not found");
            }
            if(model != null) if (null == model.getId()) {
                model.setId(book.getId());
            }
            return service.updateBook(model);
        }

        @DeleteMapping("/books/{id}")
        public void deleteBook(@PathVariable Long id){
            service.deleteBook(id);
        }

        @GetMapping("/books/{id}")
        public BookModel getBook(@PathVariable Long id){
            return service.getBook(id);
        }
        @GetMapping("/books")
        public List<BookModel> getAllBooks(){
            return service.getAllBooks();
        }
}

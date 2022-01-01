package com.smari.server.dao;

import com.smari.server.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JPA repository for DAO operations, if needed custom queries can be added by writing new methods
 * @author smari
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}

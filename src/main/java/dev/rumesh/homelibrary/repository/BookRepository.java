package dev.rumesh.homelibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.rumesh.homelibrary.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}

package dev.rumesh.homelibrary.repository

import dev.rumesh.homelibrary.domain.Book
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import java.time.LocalDate

@SpringBootTest
@Transactional
class BookRepositorySpec extends Specification {

    @Autowired
    BookRepository bookRepository

    def "test findByIsbn, should return book"() {
        given:
        Book book = bookRepository.save(new Book().with {
            it.title = "Test Title"
            it.isbn = UUID.randomUUID().toString()
            it.publishDate = LocalDate.now().minusYears(10)
            it.numberOfPages = 212
            it
        })

        when:
        Optional<Book> optionalBook = bookRepository.findByIsbn(book.getIsbn())

        then:
        optionalBook.get() != null
    }
}

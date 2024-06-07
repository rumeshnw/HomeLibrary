package dev.rumesh.homelibrary.service

import dev.rumesh.homelibrary.TestPropertyUtils
import dev.rumesh.homelibrary.domain.Book
import dev.rumesh.homelibrary.repository.BookRepository
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import spock.lang.Specification

import java.time.LocalDate

@SpringBootTest
@Transactional
@TestPropertySource(locations = TestPropertyUtils.TEST_PROPERTIES_LOCATION)
class BookServiceSpec extends Specification {

    @Autowired
    BookService bookService

    @Autowired
    BookRepository bookRepository

    def "test getAllBooks, should return all tests"() {
        given:
        bookRepository.save(new Book().with {
            it.title = "Test Title"
            it.isbn = UUID.randomUUID().toString()
            it.publishDate = LocalDate.now().minusYears(10)
            it.numberOfPages = 212
            it
        })

        when:
        List<Book> books = bookService.getAllBooks()

        then:
        books.size() == 1
    }
}

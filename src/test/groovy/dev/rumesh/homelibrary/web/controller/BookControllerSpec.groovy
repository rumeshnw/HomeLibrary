package dev.rumesh.homelibrary.web.controller

import dev.rumesh.homelibrary.domain.Book
import dev.rumesh.homelibrary.repository.BookRepository
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.TestPropertySource
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import spock.lang.Specification

import java.time.LocalDate

@AutoConfigureMockMvc
@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class BookControllerSpec extends Specification {

    @Autowired
    private MockMvc mvc

    @Autowired
    BookRepository bookRepository

    def "test getAllBooks, should return all books"() {
        given:
        bookRepository.save(new Book().with {
            it.title = "Test Title"
            it.isbn = UUID.randomUUID().toString()
            it.publishDate = LocalDate.now().minusYears(10)
            it.numberOfPages = 212
            it
        })

        when:
        def response = mvc.perform(MockMvcRequestBuilders.get("/api/books")
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON))
            .andReturn()
            .response

        then:
        response.status == 200
    }
}

package com.wilsomani.demospringkotlin2.bootstrap

import com.wilsomani.demospringkotlin2.model.Author
import com.wilsomani.demospringkotlin2.model.Book
import com.wilsomani.demospringkotlin2.model.Publisher
import com.wilsomani.demospringkotlin2.repositories.AuthorRepository
import com.wilsomani.demospringkotlin2.repositories.BookRepository
import com.wilsomani.demospringkotlin2.repositories.PublisherRepository
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class DevBootsrap(private val authorRepository: AuthorRepository,
                  private val bookRepository: BookRepository,
                  private val publisherRepository: PublisherRepository) : ApplicationListener<ContextRefreshedEvent> {

    override fun onApplicationEvent(p0: ContextRefreshedEvent) {
        initData()
    }

    private fun initData() {
        val eric = Author(firstName = "Eric", lastName = "Evans")

        val harper = Publisher(name = "Harper Collins", address = "London")
        val worx = Publisher(name = "Worx", address = "America")
        publisherRepository.save(harper)
        publisherRepository.save(worx)

        val ddd = Book(title = "Domain driven design", isbn = "1234", publisher = harper)
        eric.books.plus(ddd)
        ddd.authors.plus(eric)

        authorRepository.save(eric)
        bookRepository.save(ddd)

        val rod = Author(firstName = "Rod", lastName = "Johnson")
        val noEJB = Book(title = "J2EE development without EJB", isbn = "23444", publisher = worx)
        rod.books.plus(noEJB)
        noEJB.authors.plus(rod)

        authorRepository.save(rod)
        bookRepository.save(noEJB)
    }
}
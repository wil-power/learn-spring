package com.wilsomani.demospringkotlin2.repositories

import com.wilsomani.demospringkotlin2.model.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository: CrudRepository<Book, Long> {
}
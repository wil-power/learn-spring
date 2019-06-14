package com.wilsomani.demospringkotlin2.repositories

import com.wilsomani.demospringkotlin2.model.Author
import org.springframework.data.repository.CrudRepository

interface AuthorRepository: CrudRepository<Author, Long> {

}
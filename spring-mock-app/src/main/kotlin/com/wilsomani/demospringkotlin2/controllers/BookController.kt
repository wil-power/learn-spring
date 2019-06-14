package com.wilsomani.demospringkotlin2.controllers

import com.wilsomani.demospringkotlin2.repositories.BookRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class BookController(private var bookRepository: BookRepository) {


    @RequestMapping("/books")
    fun getBooks(model: Model): String {
        model.addAttribute("books", bookRepository.findAll())

        return "books"
    }
}
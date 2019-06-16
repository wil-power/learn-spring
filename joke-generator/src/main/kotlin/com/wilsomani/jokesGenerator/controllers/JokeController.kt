package com.wilsomani.jokesGenerator.controllers

import com.wilsomani.jokesGenerator.services.JokeGenService
import com.wilsomani.jokesGenerator.services.JokeService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.Mapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class JokeController(val jokeService: JokeGenService) {

    @RequestMapping("/", "")
    fun viewJoke(model: Model): String {
        model.addAttribute("joke", jokeService.getJoke())

        return "chucknorris"
    }
}
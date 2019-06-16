package com.wilsomani.jokesGenerator.services

import org.springframework.stereotype.Service
import guru.springframework.norris.chuck.ChuckNorrisQuotes

@Service
class JokeService: JokeGenService {
    private val chuckNorrisQuotes: ChuckNorrisQuotes = ChuckNorrisQuotes()

    override fun getJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}
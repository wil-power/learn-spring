package com.wilsomani.services

import org.springframework.stereotype.Service

const val HELLO_GURUS = "Hello Gurus"

@Service
class GreetingServiceImpl: GreetingService {

    override fun sayGreeting(): String {
        return HELLO_GURUS
    }

}
package com.wilsomani.services

import org.springframework.stereotype.Service

@Service
class ConstructorGreetingService : GreetingService {
    override fun sayGreeting(): String {
        return "hello i was injected via the constructor"
    }
}
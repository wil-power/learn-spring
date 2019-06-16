package com.services

import org.springframework.stereotype.Service

@Service
class SetterGreetingService : GreetingService {
    override fun sayGreeting(): String {
        return "hello i was injected via the setter"
    }
}
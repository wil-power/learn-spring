package com.services

import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("es")
@Primary // this will cause an error if there's more than one primary bean among the activated profiles
class PrimarySpanishGreetingService: GreetingService {

    override fun sayGreeting(): String {
        return "servicio de saludo primario"
    }
}
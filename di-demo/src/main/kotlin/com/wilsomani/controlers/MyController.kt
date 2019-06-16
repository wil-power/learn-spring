package com.wilsomani.controlers

import com.services.GreetingService
import org.springframework.stereotype.Controller

// don't need to use qualifier cos a primary(default) bean is set
@Controller
class MyController(private val greetingService: GreetingService) {

    fun hello(): String {

        return greetingService.sayGreeting()
    }
}

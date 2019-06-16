package com.wilsomani.controlers

import com.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class SetterInjectedController {
    var greetingService: GreetingService? = null
        @Autowired
        @Qualifier("setterGreetingService")
        set

    fun sayHello(): String? {
        return  greetingService?.sayGreeting()
    }
}
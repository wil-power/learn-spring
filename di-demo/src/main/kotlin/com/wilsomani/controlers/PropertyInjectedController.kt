package com.wilsomani.controlers

import com.wilsomani.services.GreetingServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class PropertyInjectedController {

    @Autowired
    var greetingService: GreetingServiceImpl? = null
    // don't need qualifier cos there's only one service of type GreetingServiceImpl

    fun sayHello(): String? {
        return greetingService?.sayGreeting()
    }
}
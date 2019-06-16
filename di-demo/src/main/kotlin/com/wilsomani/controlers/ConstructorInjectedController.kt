package com.wilsomani.controlers

import com.wilsomani.services.GreetingService
import org.springframework.stereotype.Controller

// the constructor is automatically autoWired.
// if the name of the variable is the same as the particular service wanted, no need for qualifier
// this is not recommended. one issue encountered is that spring will ignore the variable name and
// use the primary bean. so please use qualifier.
@Controller
class ConstructorInjectedController(private val constructorGreetingService: GreetingService) {

    fun sayHello(): String {
        return constructorGreetingService.sayGreeting()
    }
}
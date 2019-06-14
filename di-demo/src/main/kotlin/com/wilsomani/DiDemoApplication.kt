package com.wilsomani

import com.wilsomani.controlers.ConstructorInjectedController
import com.wilsomani.controlers.MyController
import com.wilsomani.controlers.PropertyInjectedController
import com.wilsomani.controlers.SetterInjectedController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext

@SpringBootApplication
class DiDemoApplication

fun main(args: Array<String>) {
    val ctx: ApplicationContext = runApplication<DiDemoApplication>(*args)
//  or val ctx: ApplicationContext = runApplication<DiDemoApplication>(*args)

    val controller = ctx.getBean("myController") as MyController
    val propertyInjectedController = ctx.getBean("propertyInjectedController") as PropertyInjectedController
    val setterController = ctx.getBean("setterInjectedController") as SetterInjectedController
    val constructorInjectedController = ctx.getBean("constructorInjectedController") as ConstructorInjectedController

    println("myController ${controller.hello()}")
    println("propertyInjected ${propertyInjectedController.sayHello()}")
    println("setterInjected ${setterController.sayHello()}")
    println("constructorInjected ${constructorInjectedController.sayHello()}")
}

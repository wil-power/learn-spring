package com.wilsomani.controllers

import com.wilsomani.controlers.ConstructorInjectedController
import com.wilsomani.services.GreetingServiceImpl
import com.wilsomani.services.HELLO_GURUS
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ConstructorInjectedControllerTest {

    private lateinit var constructorInjectedController: ConstructorInjectedController

    @Before
    fun setUp(): Unit {
        this.constructorInjectedController = ConstructorInjectedController(GreetingServiceImpl())
    }

    @Test
    fun testGreeting() {
        Assert.assertEquals(HELLO_GURUS, this.constructorInjectedController.sayHello())
    }
}
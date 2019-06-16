package com.wilsomani.controllers

import com.wilsomani.controlers.PropertyInjectedController
import com.wilsomani.services.GreetingServiceImpl
import com.wilsomani.services.HELLO_GURUS
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class PropertyInjectedControllerTest {
    private lateinit var propertyInjectedController: PropertyInjectedController

    @Before
    fun setUp(): Unit {
        this.propertyInjectedController = PropertyInjectedController()
        this.propertyInjectedController.greetingService = GreetingServiceImpl()
    }

    @Test
    fun testGreeting(): Unit {
        println(propertyInjectedController.sayHello())
        assertEquals(HELLO_GURUS, propertyInjectedController.sayHello())
    }
}
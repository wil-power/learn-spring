package com.wilsomani.controllers

import com.wilsomani.controlers.SetterInjectedController
import com.wilsomani.services.GreetingServiceImpl
import com.wilsomani.services.HELLO_GURUS
import junit.framework.Assert
import org.junit.Before
import org.junit.Test

class SetterInjectedControllerTest {
    private lateinit var setterInjectedController: SetterInjectedController

    @Before
    fun setUp(): Unit {
        this.setterInjectedController = SetterInjectedController()
        this.setterInjectedController.greetingService = GreetingServiceImpl()
    }

    @Test
    fun testGreeting(): Unit {
        println(setterInjectedController.sayHello())
        Assert.assertEquals(HELLO_GURUS, setterInjectedController.sayHello())
    }
}
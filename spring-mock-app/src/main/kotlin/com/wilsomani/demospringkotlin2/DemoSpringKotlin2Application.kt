package com.wilsomani.demospringkotlin2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoSpringKotlin2Application

fun main(args: Array<String>) {
	print("arg");
	runApplication<DemoSpringKotlin2Application>(*args)
}

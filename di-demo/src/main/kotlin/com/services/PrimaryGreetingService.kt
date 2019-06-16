package com.services

import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("en", "default") // default profile is used when there is no active profile
@Primary // @primary makes this the default bean to inject when there are multiple beans of it's type
class PrimaryGreetingService: GreetingService {

    override fun sayGreeting(): String {
        return "i am the primary greeting service"
    }
}
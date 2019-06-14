package com.wilsomani

import org.springframework.beans.factory.*
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
class LifeCycleDemoBean : InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    init {
        println("@@@ i am currently in the lifecycle bean constructor")
    }

    override fun afterPropertiesSet() {
        println("@@@ i am currently in the lifecycle bean after properties set")
    }

    override fun destroy() {
        println("@@@ i am currently in the lifecycle bean destroyer")
    }

    override fun setBeanName(p0: String) {
        println("@@@ the bean name is $p0")
    }

    override fun setBeanFactory(p0: BeanFactory) {
        println("@@@ i am currently in the lifecycle bean set bean factory")
    }

    override fun setApplicationContext(p0: ApplicationContext) {
        println("@@@ i am currently in the lifecycle bean set application context")
    }

    @PostConstruct
    fun postConstruct(): Unit {
        println("@@@ post construct annotated method")
    }

    @PreDestroy
    fun preDestroy(): Unit {
        println("@@@ preDestroy annotated method")
    }


    fun beforeInit(): Unit {
        println("@@@ beforeInit called from custom bean post processor")
    }

    fun afterInit(): Unit {
        println("@@@ afterInit called from custom bean post processor")
    }
}
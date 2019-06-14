package com.wilsomani

import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.stereotype.Component

@Component
class CustomBeanPostProcessor: BeanPostProcessor {

    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
        if (bean is LifeCycleDemoBean)
            (bean as LifeCycleDemoBean).afterInit()

        return bean
    }

    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any? {
        if (bean is LifeCycleDemoBean)
            (bean as LifeCycleDemoBean).beforeInit()

        return bean
    }
}
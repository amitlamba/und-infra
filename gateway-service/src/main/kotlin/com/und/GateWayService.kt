package com.und


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@EnableZuulProxy
class GatewayService

    fun main(args: Array<String>) {

        SpringApplication.run(GatewayService::class.java, *args)
    }



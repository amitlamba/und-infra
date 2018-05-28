package com.und


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
@RefreshScope
class EurekaServiceService

    fun main(args: Array<String>) {

        SpringApplication.run(EurekaServiceService::class.java, *args)
    }



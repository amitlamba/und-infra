package com.und

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer
//import zipkin.server.internal.EnableZipkinServer

@SpringBootApplication
@EnableEurekaClient
//@EnableZipkinServer
@EnableZipkinStreamServer
class ZipkinService

fun main(args: Array<String>) {

    SpringApplication.run(ZipkinService::class.java, *args)
}


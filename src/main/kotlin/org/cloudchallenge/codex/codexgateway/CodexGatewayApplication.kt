package org.cloudchallenge.codex.codexgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableConfigurationProperties
@EnableDiscoveryClient
class CodexGatewayApplication

fun main(args: Array<String>) {
	runApplication<CodexGatewayApplication>(*args)
}

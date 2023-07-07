package com.ojo.backend.delivery.config

import org.apache.commons.lang3.concurrent.CircuitBreaker
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class AppConfig {
    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }

    @Bean
    fun webClient(): WebClient.Builder {
        return WebClient.builder()
    }
}

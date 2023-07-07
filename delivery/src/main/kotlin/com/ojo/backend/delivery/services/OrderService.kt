package com.ojo.backend.delivery.services

import com.ojo.backend.delivery.models.Orders
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class OrderService(private val restTemplate: RestTemplate) {
    fun createOrder(order: Orders): Orders {
        val purchaseURL = System.getenv("PURCHASE_URL")
        // TODO: add logic to call purchase service
        return order
    }
}
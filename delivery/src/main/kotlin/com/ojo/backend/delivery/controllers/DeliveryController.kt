package com.ojo.backend.delivery.controllers

import com.ojo.backend.delivery.models.Delivery
import com.ojo.backend.delivery.services.DeliveryService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/api/delivery")
class DeliveryController(private val deliveryService: DeliveryService) {
    @GetMapping
    fun getDeliveries(): List<Delivery> {
        return deliveryService.getDeliveries()
    }

    @GetMapping("/{deliveryId}")
    fun getDelivery(deliveryId: Long): Delivery {
        return deliveryService.getDelivery(deliveryId)
    }

    @PostMapping
    fun createDelivery(@RequestBody delivery: Delivery): Delivery {
        return deliveryService.createDelivery(delivery)
    }
}
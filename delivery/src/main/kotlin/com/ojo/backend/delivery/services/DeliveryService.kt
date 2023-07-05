package com.ojo.backend.delivery.services

import com.ojo.backend.delivery.exceptions.BadRequestException
import com.ojo.backend.delivery.exceptions.NotFoundException
import com.ojo.backend.delivery.models.Delivery
import com.ojo.backend.delivery.repository.DeliveryRepo
import org.springframework.stereotype.Service
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class DeliveryService(
    private val deliveryRepo: DeliveryRepo,
    private val logger: Logger = LoggerFactory.getLogger(DeliveryService::class.java),
) {
    fun getDelivery(deliveryId: Long): Delivery {
        try {
            return deliveryRepo.findById(deliveryId).get()
        } catch (e: Exception) {
            logger.info("Error: $e")
            throw NotFoundException(
                message = "Error finding delivery",
            )
        }
    }

    fun getDeliveries(): List<Delivery> {
        try {
            return deliveryRepo.findAll()
        } catch (e: Exception) {
            logger.info("Error: $e")
            throw NotFoundException(
                message = "Error listing deliveries",
            )
        }
    }

    fun createDelivery(delivery: Delivery): Delivery {
        try {
            return deliveryRepo.save(delivery)
        } catch (e: Exception) {
            logger.info("Error: $e")
            throw BadRequestException(
                message = "Error creating delivery",
            )
        }
    }
}
package com.ojo.backend.delivery.repository

import com.ojo.backend.delivery.models.Delivery
import org.springframework.data.jpa.repository.JpaRepository

interface DeliveryRepo: JpaRepository<Delivery, Long> {}
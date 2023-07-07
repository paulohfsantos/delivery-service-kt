package com.ojo.backend.delivery.models

import javax.persistence.*

@Entity
data class Delivery(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val deliveryId: Long = 0,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    var order: Orders,

    @Column(name = "delivery_status")
    var deliveryStatus: String = "",
)
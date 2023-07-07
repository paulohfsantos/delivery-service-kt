package com.ojo.backend.delivery.models

import javax.persistence.*

@Entity
data class Orders(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val orderId: Long = 0,

    @Column(name = "order_status")
    var orderStatus: String = "",

    @OneToOne(mappedBy = "order", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var delivery: Delivery,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "delivery_address_id", referencedColumnName = "deliveryAddressId")
    var deliveryAddress: DeliveryAddress,

    @Column(name = "purchase_id")
    var purchaseId: Long = 0,
)

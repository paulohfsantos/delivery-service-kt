package com.ojo.backend.delivery.models

import javax.persistence.*

@Entity
data class DeliveryAddress(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val deliveryAddressId: Long = 0,

    @Column(name = "delivery_id")
    val deliveryId: Long = 0,

    @Column(name = "street")
    val street: String = "",

    @Column(name = "city")
    val city: String = "",

    @Column(name = "state")
    val state: String = "",

    @Column(name = "zip")
    val zip: String = "",

    @Column(name = "country")
    val country: String = "",

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "deliveryAddress")
    var order: Orders,

//    @OneToMany(mappedBy = "deliveryAddress", fetch = FetchType.LAZY)
//    var deliveries: Set<Delivery> = HashSet()
)

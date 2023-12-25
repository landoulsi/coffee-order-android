package com.careem.coffeeorderingapp

data class OrderRequest(
    val name: String,
    val size: Int,
    val type: Int
)
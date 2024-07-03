package com.arlandatec.restauranteapp

data class Producto(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val estado: Int,
    val categoria: Categoria
)

package com.gabriel.taskmaster.baseclasses

data class Item(
    var nome: String? = null,
    var categoria: String? = null,
    var endereco: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null
)

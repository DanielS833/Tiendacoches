package com.example.tiendarecyclerview.models

class Coche (
    var name: String,
    var brand: String,
    var price: Int,
    var image: String
) {

    override fun toString(): String {
        return "Coche(name='$name', brand='$brand', price='$price', image='$image')"
    }
}
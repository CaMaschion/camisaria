package com.maschion.camisaria.data.model

data class Shirt(
    var measure: Measure,
    var fabric: String,
    var color: String,

) {
    override fun toString(): String = measure.toString() + fabric + color
}

package com.maschion.camisaria.data.model

data class Measure(
    var collar: Double,
    var shoulder: Double,
    var betweenShoulder: Double,
    var chest: Double,
    var waist: Double,
    var hip: Double,
    var totalLength: Double,
    var biceps: Double,
    var forearm: Double,
    var shirtSleeve: Double,
    var rightFist: Double,
    var leftFist: Double,
    var elbowHeight: Double,
    var bodyHeight: Double,
    var armhole: Double,
)  {
    override fun toString(): String = collar.toString() + shoulder.toString()
}

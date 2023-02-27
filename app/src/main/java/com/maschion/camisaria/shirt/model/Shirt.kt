package com.maschion.camisaria.shirt.model

data class Shirt(
    var owner: Int,
    var id: Int,
    var fabric: String,
    var color: String,
    var collar: ShirtMeasure,
    var shoulder: ShirtMeasure,
    var betweenShoulder: ShirtMeasure,
    var chest: ShirtMeasure,
    var waist: ShirtMeasure,
    var hip: ShirtMeasure,
    var totalLength: ShirtMeasure,
    var biceps: ShirtMeasure,
    var forearm: ShirtMeasure,
    var shirtSleeve: ShirtMeasure,
    var rightFist: ShirtMeasure,
    var leftFist: ShirtMeasure,
    var elbowHeight: ShirtMeasure,
    var bodyHeight: ShirtMeasure,
    var armpits: ShirtMeasure

)

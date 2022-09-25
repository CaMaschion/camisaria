package com.maschion.camisaria.data.model

import java.util.*
import kotlin.collections.ArrayList

class Client(
    var name: String,
    var birthday: Date,
    var email: String,
    var phone: String,
    var address: String
) {
    lateinit var shirtList : ArrayList<Shirt>

    fun addShirt(shirt: Shirt) {
        if (shirtList.isNullOrEmpty()) {
            shirtList = ArrayList()
        }
            shirtList.add(shirt)
    }

    override fun toString(): String {
        return name + birthday
    }

}

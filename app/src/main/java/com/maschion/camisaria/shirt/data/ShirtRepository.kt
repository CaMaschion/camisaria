package com.maschion.camisaria.shirt.data

import com.maschion.camisaria.shirt.model.Shirt

class ShirtRepository {

    fun getShirtByOwner(owner: Int) : List<Shirt> = throw Exception("Not implemented")

    fun getShirtById(id: Int) : Shirt = throw Exception("Not implemented")

    fun save(shirt: Shirt){
        throw Exception("Not implemented")
    }

    fun update(shirt: Shirt): Shirt {
         return shirt
    }

    fun delete(id: Int) {
        throw Exception("Not implemented")
    }

}
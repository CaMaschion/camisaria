package com.maschion.camisaria.shirt.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.maschion.camisaria.shirt.data.ShirtRepository
import com.maschion.camisaria.shirt.model.Shirt

class StepOneMeasurementChartViewModel constructor(
    private val repository: ShirtRepository
) : ViewModel() {

    private val _shirt = MutableLiveData<Shirt>()
    private val shirt: LiveData<Shirt> get() = _shirt


    private fun save() {
        shirt.value?.let { repository.save(it) }
    }

    fun saveShirtEvent() {

    }

}

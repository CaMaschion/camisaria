package com.maschion.camisaria.shirt.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.maschion.camisaria.shirt.data.ShirtRepository
import com.maschion.camisaria.shirt.model.Shirt

class StepOneMeasurementChartViewModel constructor(
    private val repository: ShirtRepository
) : ViewModel() {

    val shirt = MutableLiveData<Shirt>()

    fun getMeasure(measure: String){
        shirt.value.apply {

        }
    }



}

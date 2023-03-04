package com.maschion.camisaria.shirt.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.maschion.camisaria.shirt.data.ShirtRepository

class StepOneMeasurementChartViewModelFactory constructor(private val repository: ShirtRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(StepOneMeasurementChartViewModel::class.java)) {
            StepOneMeasurementChartViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("ViewModel not found")
        }
    }
}
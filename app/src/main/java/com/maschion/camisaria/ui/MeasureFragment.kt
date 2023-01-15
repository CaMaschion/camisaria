package com.maschion.camisaria.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.maschion.camisaria.databinding.FragmentMeasurementChartBinding

class MeasureFragment : Fragment() {

    private lateinit var binding: FragmentMeasurementChartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMeasurementChartBinding.inflate(inflater, container, false)
        return binding.root
    }


}
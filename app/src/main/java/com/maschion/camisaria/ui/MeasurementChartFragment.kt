package com.maschion.camisaria.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.maschion.camisaria.R
import com.maschion.camisaria.databinding.FragmentMeasurementChartBinding
import kotlinx.android.synthetic.main.fragment_measurement_chart.*

class MeasurementChartFragment : Fragment() {

    private lateinit var binding: FragmentMeasurementChartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMeasurementChartBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.collarTextView.setMeasureText(getString(R.string.collarTextMeasure))
        binding.shoulderTextView.setMeasureText(getString(R.string.shoulderTextMeasure))
        binding.betweenShoulderTextView.setMeasureText(getString(R.string.betweenShoulderTextMeasure))
        binding.chestTextView.setMeasureText(getString(R.string.chestTextMeasure))
        binding.waistTextView.setMeasureText(getString(R.string.waistTextMeasure))
        binding.hipTextView.setMeasureText(getString(R.string.hipTextMeasure))
        binding.totalLengthTextView.setMeasureText(getString(R.string.totalLengthTextMeasure))
        binding.bottomHeightTextView.setMeasureText(getString(R.string.bottomHeightTextMeasure))
        binding.bicepsTextView.setMeasureText(getString(R.string.bicepsTextMeasure))
        binding.forearmTextView.setMeasureText(getString(R.string.forearmTextMeasure))
        binding.shirtSleeveTextView.setMeasureText(getString(R.string.shirtSleeveTextMeasure))
        binding.rightFistTextView.setMeasureText(getString(R.string.rightFistTextMeasure))
        binding.leftFistTextView.setMeasureText(getString(R.string.leftFistTextMeasure))
        binding.elbowHeightTextView.setMeasureText(getString(R.string.elbowHeightTextMeasure))
        binding.bodyHeightTextView.setMeasureText(getString(R.string.bodyHeightTextMeasure))
        binding.armpitsTextView.setMeasureText(getString(R.string.armpitsTextMeasure))

    }

}
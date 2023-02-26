package com.maschion.camisaria.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.maschion.camisaria.R
import com.maschion.camisaria.databinding.FragmentMeasurementChartBinding
import com.maschion.camisaria.viewmodel.ShirtViewModel
import kotlinx.android.synthetic.main.fragment_measurement_chart.*

class MeasurementChartFragment : Fragment() {

    private lateinit var binding: FragmentMeasurementChartBinding
    private lateinit var viewModel: ShirtViewModel

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

        viewModel = ViewModelProvider(this)[ShirtViewModel::class.java]

        binding.apply {
            collarTextView.setMeasureText(getString(R.string.collarTextMeasure))
            shoulderTextView.setMeasureText(getString(R.string.shoulderTextMeasure))
            betweenShoulderTextView.setMeasureText(getString(R.string.betweenShoulderTextMeasure))
            chestTextView.setMeasureText(getString(R.string.chestTextMeasure))
            waistTextView.setMeasureText(getString(R.string.waistTextMeasure))
            hipTextView.setMeasureText(getString(R.string.hipTextMeasure))
            totalLengthTextView.setMeasureText(getString(R.string.totalLengthTextMeasure))
            bottomHeightTextView.setMeasureText(getString(R.string.bottomHeightTextMeasure))
            bicepsTextView.setMeasureText(getString(R.string.bicepsTextMeasure))
            forearmTextView.setMeasureText(getString(R.string.forearmTextMeasure))
            shirtSleeveTextView.setMeasureText(getString(R.string.shirtSleeveTextMeasure))
            rightFistTextView.setMeasureText(getString(R.string.rightFistTextMeasure))
            leftFistTextView.setMeasureText(getString(R.string.leftFistTextMeasure))
            elbowHeightTextView.setMeasureText(getString(R.string.elbowHeightTextMeasure))
            bodyHeightTextView.setMeasureText(getString(R.string.bodyHeightTextMeasure))
            armpitsTextView.setMeasureText(getString(R.string.armpitsTextMeasure))
        }

    }

}
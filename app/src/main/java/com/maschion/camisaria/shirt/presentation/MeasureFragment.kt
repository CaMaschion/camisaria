package com.maschion.camisaria.shirt.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.maschion.camisaria.R
import com.maschion.camisaria.databinding.FragmentMeasuresBinding
import com.maschion.camisaria.shirt.data.ShirtRepository
import com.maschion.camisaria.shirt.viewmodel.StepOneMeasurementChartViewModel
import com.maschion.camisaria.shirt.viewmodel.StepOneMeasurementChartViewModelFactory

//alterar essa tela pra recyclerview ou utilizar compose

class MeasureFragment : Fragment() {

    private lateinit var binding: FragmentMeasuresBinding
    private lateinit var viewModel: StepOneMeasurementChartViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMeasuresBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(
            this, StepOneMeasurementChartViewModelFactory(
                ShirtRepository()
            )
        )[StepOneMeasurementChartViewModel::class.java]

        binding.apply {

            header.apply {
                setupHeaderCustomView(getString(R.string.measure_header))
                setupHeaderCustomView(getString(R.string.measure_add_header))
            }

            collarTextView.apply {
                setupCustomView(getString(R.string.collarTextMeasure))
                addListener({
                    println("camilaaaaa $it")
                }, {
                    println("camilaaaaa $it")
                })
            }

            shoulderTextView.setupCustomView(getString(R.string.shoulderTextMeasure))
            betweenShoulderTextView.setupCustomView(getString(R.string.betweenShoulderTextMeasure))
            chestTextView.setupCustomView(getString(R.string.chestTextMeasure))
            waistTextView.setupCustomView(getString(R.string.waistTextMeasure))
            hipTextView.setupCustomView(getString(R.string.hipTextMeasure))
            totalLengthTextView.setupCustomView(getString(R.string.totalLengthTextMeasure))
            bottomHeightTextView.setupCustomView(getString(R.string.bottomHeightTextMeasure))
            bicepsTextView.setupCustomView(getString(R.string.bicepsTextMeasure))
            forearmTextView.setupCustomView(getString(R.string.forearmTextMeasure))
            shirtSleeveTextView.setupCustomView(getString(R.string.shirtSleeveTextMeasure))
            rightFistTextView.setupCustomView(getString(R.string.rightFistTextMeasure))
            leftFistTextView.setupCustomView(getString(R.string.leftFistTextMeasure))
            elbowHeightTextView.setupCustomView(getString(R.string.elbowHeightTextMeasure))
            bodyHeightTextView.setupCustomView(getString(R.string.bodyHeightTextMeasure))
            armpitsTextView.setupCustomView(getString(R.string.armpitsTextMeasure))
        }
    }
}

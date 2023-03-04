package com.maschion.camisaria.ui

import android.content.Context
import android.text.Editable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.LinearLayout
import androidx.core.widget.addTextChangedListener
import com.maschion.camisaria.R
import com.maschion.camisaria.databinding.MeasurementChartCustomviewBinding

class InputMeasureClientComponent(
    context: Context, attrs: AttributeSet
) : LinearLayout(context, attrs) {

    private val binding: MeasurementChartCustomviewBinding =
        MeasurementChartCustomviewBinding.inflate(
            LayoutInflater.from(context), this, true
        )

    init {
        context.obtainStyledAttributes(attrs, R.styleable.InputMeasureClientCustomView).apply {
            binding.measuresChart.text =
                getString(R.styleable.InputMeasureClientCustomView_measureText)
        }

    }

    fun addListener(measureCallback: (String) -> Unit, extraMeasureCallback: (String) -> Unit){

        this.binding.editTextMeasure.addTextChangedListener {
            measureCallback(it.toString())
        }

        this.binding.editTexAdd.addTextChangedListener {
            extraMeasureCallback(it.toString())
        }

    }

    fun setupCustomView(label: String, measure: String, extraMeasure: String) {
        this.binding.measuresChart.text = label
        this.binding.editTextMeasure.setText(measure)
        this.binding.editTexAdd.setText(extraMeasure)

    }

}

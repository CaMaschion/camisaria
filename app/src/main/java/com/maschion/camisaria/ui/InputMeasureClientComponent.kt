package com.maschion.camisaria.ui

import android.content.Context
import android.text.Editable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.LinearLayout
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

    fun setMeasureText(measure: String) {
        this.binding.measuresChart.text = measure
    }

    fun getEditMeasureText() {
        this.binding.editTextMeasure.text.toString()
    }

    fun getEditExtraMeasureText() {
        this.binding.editTexAdd.text.toString()
    }

}

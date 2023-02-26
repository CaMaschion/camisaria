package com.maschion.camisaria.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.maschion.camisaria.R
import com.maschion.camisaria.databinding.MeasurementChartCustomviewBinding

class InputMeasureClientCustomView(
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

}

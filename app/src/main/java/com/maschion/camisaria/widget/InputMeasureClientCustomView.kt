package com.maschion.camisaria.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.constraintlayout.widget.ConstraintLayout
import com.maschion.camisaria.R
import com.maschion.camisaria.databinding.MeasurementChartCustomviewBinding

class InputMeasureClientCustomView (context: Context, attrs: AttributeSet
    ) : ConstraintLayout(context, attrs) {

    private val binding: MeasurementChartCustomviewBinding = MeasurementChartCustomviewBinding.inflate(
        LayoutInflater.from(context), this, true
    )

    init {
        layoutParams = LayoutParams(MATCH_PARENT, WRAP_CONTENT)
        inflate(context, R.layout.measurement_chart_customview, this)
    }


}

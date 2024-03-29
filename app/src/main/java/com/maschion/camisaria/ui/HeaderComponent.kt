package com.maschion.camisaria.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.maschion.camisaria.databinding.ComponentHeaderBinding

class HeaderComponent (context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    
    private val binding: ComponentHeaderBinding =
        ComponentHeaderBinding.inflate(
        LayoutInflater.from(context), this, true
    )

    fun setupHeaderCustomView(label: String) {
        this.binding.measures.text = label
        this.binding.add.text = label

    }

}
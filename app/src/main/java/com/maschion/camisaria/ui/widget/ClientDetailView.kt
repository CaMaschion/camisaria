package com.maschion.camisaria.ui.widget

import android.content.Context
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import android.widget.TextView
import com.maschion.camisaria.R

class ClientDetailView (context: Context) : LinearLayout(context) {

    private val repository by lazy { findViewById<TextView>(R.id.rep_github) }

    init {
        orientation = VERTICAL
        layoutParams = LayoutParams(MATCH_PARENT, WRAP_CONTENT)
        inflate(context, R.layout.client_detail_view, this)
    }

    fun setup(item: Item) {

        repository.text = item.name
    }

}
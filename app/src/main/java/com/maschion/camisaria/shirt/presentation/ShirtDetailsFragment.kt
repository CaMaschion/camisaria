package com.maschion.camisaria.shirt.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.maschion.camisaria.databinding.FragmentShirtDetailsBinding

class ShirtDetailsFragment : Fragment()  {

    private lateinit var binding: FragmentShirtDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShirtDetailsBinding.inflate(inflater, container, false)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
//            pocketGroup.setupGroupCustomView(R.layout.component_group)

        }
    }

}
package com.maschion.camisaria.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import com.maschion.camisaria.R
import com.maschion.camisaria.adapter.ClientAdapter
import com.maschion.camisaria.data.model.ClientItem
import com.maschion.camisaria.databinding.FragmentHomeBinding
import java.util.*

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerview = binding.recyclerview

        recyclerview.layoutManager = LinearLayoutManager(context)

        val data = getData()

        binding.recyclerview.adapter = ClientAdapter(
            data,
            {
                Toast.makeText(context, "click", Toast.LENGTH_LONG).show()
            },
            {//delete
            }
        )

        binding.addClient.setOnClickListener {
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                replace<MeasurementChartFragment>(R.id.fragmentContainerView)
                addToBackStack(null)
            }
        }
    }

    private fun getData(): MutableList<ClientItem> {
        val data = mutableListOf<ClientItem>()

        for (i in 1..20) {
            data.add(
                ClientItem(
                    name = "Leo Onardo",
                    date = Date(10 / 10 / 2022),
                    local = "Sao Paulo"
                )
            )
        }
        return data
    }
}

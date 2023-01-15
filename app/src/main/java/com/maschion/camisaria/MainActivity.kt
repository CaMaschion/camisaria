package com.maschion.camisaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import com.maschion.camisaria.adapter.ClientAdapter
import com.maschion.camisaria.data.model.ClientItem
import com.maschion.camisaria.databinding.ActivityMainBinding
import com.maschion.camisaria.databinding.FragmentHomeBinding
import com.maschion.camisaria.ui.HomeFragment
import java.util.*

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        installSplashScreen()

        if (savedInstanceState == null) {

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<HomeFragment>(R.id.fragmentContainerView)
            }
        }
    }
//
//    private lateinit var binding: ActivityMainBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        installSplashScreen()
//
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        val recyclerview = binding.recyclerview
//
//        recyclerview.layoutManager = LinearLayoutManager(this)
//
//        val data = getData()
//
//        binding.recyclerview.adapter = ClientAdapter(
//            data,
//            {
//                Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
//            },
//            {//delete
//            }
//        )
//    }
//
//    private fun getData(): MutableList<ClientItem> {
//        val data = mutableListOf<ClientItem>()
//
//        for (i in 1..20) {
//            data.add(
//                ClientItem(
//                    name = "Leo Onardo",
//                    date = Date(10 / 10 / 2022),
//                    local = "Sao Paulo"
//                )
//            )
//        }
//        return data
//    }
}

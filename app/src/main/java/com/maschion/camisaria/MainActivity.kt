package com.maschion.camisaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import com.maschion.camisaria.adapter.CustomAdapter
import com.maschion.camisaria.data.model.ClientList
import com.maschion.camisaria.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val installSplashScreen = installSplashScreen()
//        installSplashScreen.setKeepOnScreenCondition(SplashScreen.KeepOnScreenCondition {
//            true
//        })

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // getting the recyclerview by its id
        val recyclerview = binding.recyclerview

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ClientList>()

        for (i in 1..20) {
            data.add(ClientList(name = "Leo Onardo", date = Date(10/10/1100), local = "Sao Paulo"))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}

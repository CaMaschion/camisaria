package com.maschion.camisaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import com.maschion.camisaria.adapter.ClientAdapter
import com.maschion.camisaria.data.model.ClientItem
import com.maschion.camisaria.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val installSplashScreen = installSplashScreen()


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // getting the recyclerview by its id
        val recyclerview = binding.recyclerview

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = mutableListOf<ClientItem>()

        for (i in 1..20) {
            data.add(ClientItem(name = "Leo Onardo", date = Date(10/10/1100), local = "Sao Paulo"))
        }

        // Setting the Adapter with the recyclerview
        binding.recyclerview.adapter = ClientAdapter(data) {
            Toast.makeText(this,"click", Toast.LENGTH_LONG).show()
        }

    }
}

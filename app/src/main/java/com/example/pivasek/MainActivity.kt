package com.example.pivasek

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnBeer : Button = findViewById(R.id.btnBeer)
        val tvBeer : TextView = findViewById(R.id.tvBeer)
        val spinnerBeer : Spinner = findViewById(R.id.spinBeer)
        btnBeer.setOnClickListener{
            val puzanchek : ImageView = findViewById(R.id.puzanchek)
            val type = spinnerBeer.selectedItem
            tvBeer.text = ("Ваш тип пива $type")
            puzanchek.setImageResource(R.drawable.pivochelik)
        }
    }
}
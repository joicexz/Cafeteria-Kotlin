package com.example.cafeteria

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivityHome : AppCompatActivity() {

    private lateinit var proxima: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_home)

        proxima = findViewById(R.id.imageView)

        proxima.setOnClickListener {
            val proximaTela = Intent(this, MainActivityDetalhes::class.java)
            startActivity(proximaTela)
        }

    }
}
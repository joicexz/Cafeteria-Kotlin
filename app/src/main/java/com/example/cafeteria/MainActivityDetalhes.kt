package com.example.cafeteria

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivityDetalhes : AppCompatActivity() {

    private lateinit var Voltar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_detalhes)

        Voltar = findViewById(R.id.imageView18)

        Voltar.setOnClickListener {
            val VoltarTelaHome = Intent(this, MainActivityHome::class.java)
            startActivity(VoltarTelaHome)
        }

    }
}
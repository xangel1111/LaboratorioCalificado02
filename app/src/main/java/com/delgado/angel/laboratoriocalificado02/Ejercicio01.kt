package com.delgado.angel.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio01)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        observeButtons()
    }
    private fun observeButtons(){
        findViewById<Button>(R.id.btnMostrar).setOnClickListener {
            val lnTop = findViewById<LinearLayout>(R.id.lnTop)
            lnTop.visibility = View.VISIBLE
        }
        findViewById<Button>(R.id.btnOcultar).setOnClickListener {
            val lnTop = findViewById<LinearLayout>(R.id.lnTop)
            lnTop.visibility = View.INVISIBLE
        }
    }
}
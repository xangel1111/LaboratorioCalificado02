package com.delgado.angel.laboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.delgado.angel.laboratoriocalificado02.databinding.ActivityEjercicio02Binding

class Ejercicio02 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio02Binding

    private val NAME_KEY = "NAME_KEY"
    private val PHONE_KEY = "PHONE_KEY"
    private val PRODUCTS_KEY = "PRODUCTS_KEY"
    private val CITY_KEY = "CITY_KEY"
    private val UBICATION_KEY = "UBICATION_KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEjercicio02Binding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        observerButtons()
    }

    private fun observerButtons(){
        binding.btnRegistrar.setOnClickListener{
            goPedidoActivity()
        }
    }

    private fun goPedidoActivity(){
        val name = binding.edtNombre.text.toString()
        val number = binding.edtNumero.text.toString()
        val products = binding.edtProductos.text.toString()
        val city = binding.edtCiudad.text.toString()
        val direction = binding.edtDireccion.text.toString()

        val intent = Intent(this, Ejercicio02Pedido::class.java)
        intent.putExtra(NAME_KEY, name)
        intent.putExtra(PHONE_KEY, number)
        intent.putExtra(PRODUCTS_KEY, products)
        intent.putExtra(CITY_KEY, city)
        intent.putExtra(UBICATION_KEY, direction)
        startActivity(intent)
    }
}
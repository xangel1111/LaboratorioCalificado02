package com.delgado.angel.laboratoriocalificado02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.delgado.angel.laboratoriocalificado02.databinding.ActivityEjercicio02PedidoBinding

class Ejercicio02Pedido : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio02PedidoBinding

    private val NAME_KEY = "NAME_KEY"
    private val PHONE_KEY = "PHONE_KEY"
    private val PRODUCTS_KEY = "PRODUCTS_KEY"
    private val CITY_KEY = "CITY_KEY"
    private val UBICATION_KEY = "UBICATION_KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEjercicio02PedidoBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showInformation(intent.extras)
    }

    private fun showInformation(bundle: Bundle?){
        if (bundle != null){

            val city = bundle.getString(CITY_KEY)
            val ubication = bundle.getString(UBICATION_KEY)


            binding.tvNombre.text = bundle.getString(NAME_KEY)
            binding.tvNumero.text = bundle.getString(PHONE_KEY)
            binding.tvProductos.text = bundle.getString(PRODUCTS_KEY)
            binding.tvUbicacion.text = "$city - $ubication"
        }

    }

}
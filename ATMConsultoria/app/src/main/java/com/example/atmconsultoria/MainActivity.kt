package com.example.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_LONG).show()

        button_contato.setOnClickListener {
            val intent = Intent(this, DetalheContatoActivity::class.java)
            startActivity(intent)
        }

        button_empresa.setOnClickListener {
            val intent = Intent(this, DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }

        button_servicos.setOnClickListener {
            val intent = Intent(this, DetalheServicosActivity::class.java)
            startActivity(intent)
        }

        button_clientes.setOnClickListener {
            val intent = Intent(this, DetalheClientesActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart", Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_LONG).show()
    }
}
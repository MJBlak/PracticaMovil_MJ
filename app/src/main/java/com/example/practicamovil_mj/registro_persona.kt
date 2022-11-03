package com.example.practicamovil_mj

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class registro_persona : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_persona)

        var btnAceptar : Button = findViewById(R.id.btnAceptar)

        btnAceptar.setOnClickListener {

            // Toast.makeText(this, R.string.msg_fin, Toast.LENGTH_SHORT).show()

            val ventana = Intent(this, MainActivity :: class.java)
            startActivity(ventana)
        }
    }
}
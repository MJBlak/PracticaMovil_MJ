package com.example.practicamovil_mj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText

class Agenda1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda1)

        var btnNotas : Button = findViewById(R.id.btnNotas)

        btnNotas.setOnClickListener {

            val agendaPersonal = Intent(this, Agenda1 :: class.java)
            startActivity(agendaPersonal)
        }
    }
}
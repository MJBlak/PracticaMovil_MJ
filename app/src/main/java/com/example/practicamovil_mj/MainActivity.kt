package com.example.practicamovil_mj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtUsuario: EditText = findViewById(R.id.txtUsuario)
        var txtContra: EditText = findViewById(R.id.txtContraseña)
        var btnValidar: Button = findViewById(R.id.btnAplicar)
        var btnRegistrar : Button = findViewById(R.id.btnRegistrar)

        btnRegistrar.setOnClickListener{
            val registro_persona = Intent(this, registro_persona :: class.java)
            startActivity(registro_persona)

        }

        btnValidar.setOnClickListener {
            var Validar = true
            if(txtUsuario.text.toString().trim().isEmpty()){
                Toast.makeText(this,R.string.val_usuario, Toast.LENGTH_SHORT).show()
                txtUsuario.requestFocus()
                Validar = false
            }else if(txtContra.text.toString().trim().isEmpty()){
                Toast.makeText(this,R.string.val_contra, Toast.LENGTH_SHORT).show()
                txtContra.requestFocus()
                Validar = false
            }

            if(Validar){
                Toast.makeText(this,R.string.msg_fin, Toast.LENGTH_SHORT).show()

                val ventana2 = Intent(this, Agenda1 :: class.java)
                startActivity(ventana2)
            }
        }
    }
}
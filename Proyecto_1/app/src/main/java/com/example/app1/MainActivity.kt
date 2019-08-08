package com.example.app1

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {


     var button1: Button?=null
     var button2: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById(R.id.button_1) as Button
        button2=findViewById(R.id.button_2) as Button

        button1?.setOnClickListener(this)
        button2?.setOnClickListener(this)

    }

    override fun onClick(view: View) {

        when (view.id){
            R.id.button_1 -> cambio()
            R.id.button_2 -> cambio2()
        }

    }



     fun cambio(){
        val intent= Intent(this,Activity2::class.java)
        startActivity(intent)
        Toast.makeText(this, "LO LOGRAMOS!!", Toast.LENGTH_LONG).show()
    }
     fun cambio2(){
        val intent2= Intent(this,Activity2::class.java)

         intent2.flags= Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
         startActivity(intent2)
        Toast.makeText(this, "Usted está moviéndose a la actividad B", Toast.LENGTH_LONG).show()
    }
}


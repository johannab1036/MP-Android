package com.visionlab.manejodeactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_a.*

class Activity_B : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__b)

        val ToastMsg = getString(R.string.toastMsgAB)

        ToastBtn.setOnClickListener {
            val intent = Intent(this@Activity_B, Activity_A::class.java)
            startActivity(intent)
            val toast = Toast.makeText(this, ToastMsg, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            finish()
        }
        ActivityBtn.setOnClickListener {
            val intent = Intent(this@Activity_B, Activity_A::class.java)
            startActivity(intent)
        }
    }
}

package com.example.myworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class About : AppCompatActivity() {

    var btnLogout: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        btnLogout = findViewById(R.id.btn_logout) as Button

        btnLogout!!.setOnClickListener{
            finishAffinity()
        }
    }
}
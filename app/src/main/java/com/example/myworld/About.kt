package com.example.myworld

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity() {

    private var btnLogout: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        btnLogout = findViewById(R.id.btn_logout)

        btnLogout!!.setOnClickListener{
            finishAffinity()
        }
    }
}
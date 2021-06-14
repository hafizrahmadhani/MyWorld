@file:Suppress("DEPRECATION")

package com.example.myworld

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashDuration = 5000
        Handler().postDelayed({
            val mainIntent = Intent(this@SplashScreen, MainActivity::class.java)
            this@SplashScreen.startActivity(mainIntent)
            finish()
        }, splashDuration.toLong())
    }
}
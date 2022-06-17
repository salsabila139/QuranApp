package com.salsabila.idn.samaquran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()) //buat ngambil waktu
            .postDelayed({
                startActivity(Intent(this,LoginActivity::class.java))
                finish() //buat matiin activity
            }, SPLASH_TIME_OUT)
    }
    companion object{
        private const val SPLASH_TIME_OUT = 3000L
    }
}